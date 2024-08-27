package singletonPattern;

public class Main {
    public static void main(String[] args) {
        ThreadSafeSingleton t = ThreadSafeSingleton.getInstance();
        t.showStatus();
    }
}
