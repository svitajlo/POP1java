public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        new MainThread(1, 1, breakThread).start();
        new MainThread(2, 2, breakThread).start();
        new MainThread(3, 3, breakThread).start();

        new Thread(breakThread).start();
    }
}