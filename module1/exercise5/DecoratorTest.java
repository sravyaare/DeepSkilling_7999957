public class DecoratorTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Sending through Email:");

        notifier.send("Project status updated");

        System.out.println();

        System.out.println("Sending through Email and SMS:");

        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        smsNotifier.send("Meeting scheduled at 3 PM");

        System.out.println();

        System.out.println("Sending through Email, SMS and Slack:");

        Notifier multiChannelNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        multiChannelNotifier.send("Deployment completed successfully");
    }
}