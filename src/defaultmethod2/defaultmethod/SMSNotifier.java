package defaultmethod2.defaultmethod;

public class SMSNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("[SMS] " + message);
    }
}
