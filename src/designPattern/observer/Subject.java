package designPattern.observer;

// 주제(Subject) 인터페이스
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

