public class BankTransferPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("EFT havale ile ödeme gerçekleştirildi.");
    }
}
