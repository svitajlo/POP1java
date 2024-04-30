public class MainThread extends Thread {
    private final int id;
    private final int step;
    private final BreakThread breakThread;

    public MainThread(int id, int step, BreakThread breakThread) {
        this.id = id;
        this.step = step;
        this.breakThread = breakThread;
    }

    @Override
    public void run() {
        long sum = 0;
        int count = 0;
        boolean isStop = false;
        do {
            sum += step;
            count++;
            isStop = breakThread.isCanBreak();
        } while (!isStop);
        System.out.println(id + " - Знайдена сума - " + sum + ", кількість використаних елементів - " + count);
    }
}
