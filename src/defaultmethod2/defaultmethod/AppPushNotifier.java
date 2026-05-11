package defaultmethod2.defaultmethod;

public class AppPushNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("[APP] " + message);
    }
}
