public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext(
                        new CreditCardPayment());

        paymentContext.makePayment(2500);

        paymentContext.setPaymentStrategy(
                new PayPalPayment());

        paymentContext.makePayment(1800);
    }
}