public class Test {
    public static void main(String[] args) {
        System.out.println("\nDecorator Pattern\n");
        Notifier notifier = new EmailNotifier();

        String msg = "Hello..!!!";
        System.out.println(notifier.send(msg));

        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        System.out.println(smsNotifier.send(msg));

        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        System.out.println(slackNotifier.send(msg));

        System.out.println();
    }
}
