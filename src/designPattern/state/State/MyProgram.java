package designPattern.state.State;

public class MyProgram {
    public static void main(String[] args) {
        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
        modeSwitch.onSwitch();
    }
}
