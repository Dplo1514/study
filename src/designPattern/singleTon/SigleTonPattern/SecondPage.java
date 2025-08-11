package designPattern.singleTon.SigleTonPattern;

public class SecondPage {
    private Settings settings = Settings.getSettings();
    public void printSettings(){
        System.out.println(settings.getFontSize()+ " " + settings.getDarkMode());
    }
}
