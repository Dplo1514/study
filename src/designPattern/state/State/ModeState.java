package designPattern.state.State;

public interface ModeState {
    void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState{
    @Override
    public void toggle(ModeSwitch modeSwitch) {
        modeSwitch.setState(new ModeStateDark());
    }
}

class ModeStateDark implements ModeState{

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        modeSwitch.setState(new ModeStateLight());
    }
}