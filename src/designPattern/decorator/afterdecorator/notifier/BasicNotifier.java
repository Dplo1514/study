package designPattern.decorator.afterdecorator.notifier;


import designPattern.decorator.afterdecorator.interfaces.Notifier;

public class BasicNotifier implements Notifier {

    @Override
    public void send() {
        System.out.println("기본 알림 전송");
    }

}
