public class MyThread implements Runnable{
    int time;
    private boolean state;

    public MyThread(int timeInMillis) {
        time = timeInMillis;
        state = false;
    }

    public MyThread() {
        this(10000);
    }

    public boolean isRunning() {
        return state;
    }

    @Override
    public void run() {
        try {
            state = true;
            Thread.sleep(time);
            state = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
