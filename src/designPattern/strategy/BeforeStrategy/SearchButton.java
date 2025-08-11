package designPattern.strategy.BeforeStrategy;

public class SearchButton {
    private MyProgram myProgram;

    public SearchButton (MyProgram _myProgram){
        myProgram = _myProgram;
    }
    public void onClick() {
        if (myProgram.mode == Mode.ALL){
            System.out.println("Search ALL");
        }else if (myProgram.mode == Mode.IMAGE){
            System.out.println("Search IMAGE");
        }else if (myProgram.mode == Mode.NEWS){
            System.out.println("Search NEWS");
        }else if (myProgram.mode == Mode.MAP){
            System.out.println("Search MAP");
        }
    }
}
