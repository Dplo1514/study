package designPattern.singleTon.SigleTonPattern;

public class Settings {
    // 1. 생성자를 private으로 생성함으로써 다른 클래스에서 해당 객체 생성 제한
    private Settings(){};

    // 2. Settings 객체를 static으로 선언해줌으로써 method area에 객체가 생성됨
    private static Settings settings = null;

    // 3. settings가 이미 할당된 상태이면 (다른 곳에서 getSettings()를 실행) 할당된 settings를 리턴하고 할당되지 않은 상태라면 할당
    public static Settings getSettings(){
        if (settings == null){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;
    private  int fontSize = 13;

    public boolean getDarkMode() {return darkMode;}
    public int getFontSize() {return fontSize;}

    public void setDarkMode(boolean _darkMode) {
        this.darkMode = _darkMode;
    }
    public void setFontSize(int _fontSize) {
        this.fontSize = _fontSize;
    }
}
