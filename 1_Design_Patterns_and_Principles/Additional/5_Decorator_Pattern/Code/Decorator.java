
class EmailNotifier implements Notifier{
    public String send(String msg) {
        return "Email sent with message: " + msg;
    }
}

abstract class NotifierDecorator implements Notifier {
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public String send(String msg) {
        return notifier.send(msg);
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public String send(String msg) {
        return super.send(msg) + " | SMS msg sent with message: " + msg;
    }
}

class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public String send(String msg){
        return super.send(msg) + " | Slack msg sent with message: " + msg; 
    }
}