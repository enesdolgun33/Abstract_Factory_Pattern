# Abstract_Factory_Pattern (Soyut Fabrika Deseni)

Bu proje, Java programlama dilini kullanarak **Soyut Fabrika (Abstract Factory)** tasarım deseninin basit bir uygulamasını göstermektedir. Örnek olarak farklı ödeme yöntemlerini (EFT, Kredi Kartı, PayPal) işleyen bir sistem kullanılmıştır.

## Soyut Fabrika Deseni Nedir?

Soyut Fabrika deseni, birbiriyle ilişkili veya birbirine bağımlı nesnelerin ailelerini, bu nesnelerin somut sınıflarını belirtmeden oluşturmak için bir arayüz sağlayan yaratımsal bir tasarım desenidir.

Bu projede, her ödeme türü (Banka Transferi, Kredi Kartı, PayPal) bir "aile" olarak kabul edilir. Soyut Fabrika (`PaymentFactory`), bu ailelere ait somut fabrikaların (`BankTransferPaymentFactory`, `CreditCardPaymentFactory`, `PayPalPaymentFactory`) uygulanmasını zorunlu kılar. Her somut fabrika, o aileye özgü somut ürünü (`BankTransferPayment`, `CreditCardPayment`, `PayPalPayment`) oluşturur.

## Proje Yapısı

Proje aşağıdaki temel bileşenlerden oluşmaktadır:

### 1. Ürün Arayüzü (Product Interface)

* `Payment.java`: Tüm somut ödeme yöntemlerinin uygulaması gereken `processPayment()` metodunu tanımlayan arayüz.

### 2. Somut Ürünler (Concrete Products)

* `BankTransferPayment.java`: EFT/Havale ile ödemeyi gerçekleştiren somut sınıf.
* `CreditCardPayment.java`: Kredi kartı ile ödemeyi gerçekleştiren somut sınıf.
* `PayPalPayment.java`: PayPal ile ödemeyi gerçekleştiren somut sınıf.

### 3. Soyut Fabrika Arayüzü (Abstract Factory Interface)

* `PaymentFactory.java`: Somut fabrikaların uygulaması gereken `createPayment()` metodunu tanımlayan soyut fabrika arayüzü.

### 4. Somut Fabrikalar (Concrete Factories)

* `BankTransferPaymentFactory.java`: `BankTransferPayment` nesnesi oluşturan somut fabrika.
* `CreditCardPaymentFactory.java`: `CreditCardPayment` nesnesi oluşturan somut fabrika.
* `PayPalPaymentFactory.java`: `PayPalPayment` nesnesi oluşturan somut fabrika.

### 5. İstemci (Client)

* `Main.java`: Uygulamanın giriş noktasıdır. Kullanıcıdan hangi ödeme yöntemini kullanmak istediğini alır (1: EFT, 2: Kredi Kartı, 3: PayPal) ve ilgili fabrikayı kullanarak seçilen ödeme işlemini başlatır.

## Nasıl Çalıştırılır?

1.  Proje dosyalarını bir Java IDE'sine (IntelliJ IDEA, Eclipse vb.) aktarın veya terminal üzerinden derleyin.
2.  `Main.java` dosyasını çalıştırın.
3.  Konsolda sizden bir ödeme yöntemi seçmeniz istenecektir:
    ```
    Ödeme yönteminizi seçiniz:
    1-) EFT
    2-) Kredi kartı
    3-) PayPal
    ```
4.  Seçiminize (1, 2 veya 3) göre ilgili ödeme yönteminin `processPayment()` metodu çağrılacak ve ekrana ilgili mesaj yazdırılacaktır.
    * **1** girilirse: `EFT havale ile ödeme gerçekleştirildi.`
    * **2** girilirse: `Kredi kartı ile ödeme gerçekleştirildi.`
    * **3** girilirse: `PayPal ile ödeme gerçekleştirildi.`
