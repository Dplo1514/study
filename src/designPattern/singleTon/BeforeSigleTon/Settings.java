package designPattern.singleTon.BeforeSigleTon;

public class Settings {
    // 1. dark 모드 여부
    private boolean darkMode = false;
    // 2. font size
    private  int fontSize = 13;
    // getter setter
    public boolean getDarkMode() {return darkMode;}
    public int getFontSize() {return fontSize;}

    public void setDarkMode(boolean _darkMode) {
        this.darkMode = _darkMode;
    }
    public void setFontSize(int _fontSize) {
        this.fontSize = _fontSize;
    }
}
