import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentFactory bankTransferFactory = new BankTransferPaymentFactory();

        Payment bankTransferPayment = bankTransferFactory.createPayment();


        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment =  creditCardFactory.createPayment();


        PaymentFactory paypalPaymentFactory = new PayPalPaymentFactory();
        Payment paypalPayment = paypalPaymentFactory.createPayment();


        System.out.println("Ödeme yönteminizi seçiniz:");
        System.out.println("1-) EFT");
        System.out.println("2-) Kredi kartı");
        System.out.println("3-) PayPal");
        int secim = new Scanner(System.in).nextInt();
        switch(secim) {
            case 1:
                bankTransferPayment.processPayment();
                break;
            case 2:
                creditCardPayment.processPayment();
                break;
            case 3:
                paypalPayment.processPayment();
                break;
        }
    }
}