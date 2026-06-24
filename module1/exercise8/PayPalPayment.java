public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Payment of Rs."
                        + amount
                        + " completed using PayPal.");
    }
}