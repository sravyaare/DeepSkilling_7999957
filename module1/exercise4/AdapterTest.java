public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor paytm =
                new PaytmAdapter(new PaytmGateway());

        PaymentProcessor phonePe =
                new PhonePeAdapter(new PhonePeGateway());

        paytm.processPayment(2500);

        phonePe.processPayment(1800);
    }
}