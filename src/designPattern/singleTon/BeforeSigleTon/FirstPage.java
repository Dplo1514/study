package designPattern.singleTon.BeforeSigleTon;

public class FirstPage {
    private Settings settings = new Settings();

    public void setAndPrintSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(10);
        System.out.println(settings.getFontSize() + " " + settings.getDarkMode());
    }
}
