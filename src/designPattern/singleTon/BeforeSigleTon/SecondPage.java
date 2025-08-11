package designPattern.singleTon.BeforeSigleTon;

public class SecondPage {
    private Settings settings = new Settings();
    public void printSettings(){
        System.out.println( settings.getFontSize() + " " + settings.getDarkMode());
    }
}
