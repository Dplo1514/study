package designPattern.state.State;

public class ModeSwitch {
    private ModeState modeState = new ModeStateLight();

    public void setState(ModeState _modeState){
        modeState = _modeState;
    }

    public void onSwitch(){
        modeState.toggle(this);
        System.out.println(modeState.getClass());
    }
}
