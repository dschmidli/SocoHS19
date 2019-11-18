public class OvenTimerCommand implements CommandDefault, Runnable{
    Oven oven;
    int t;

    public OvenTimerCommand(Oven newOven, int newt) {
        oven = newOven;
        t = newt;
    }

    @Override
    public void execute() {
        oven.setTimer(t);
    }


    @Override
    public void run() {
        execute();
    }
}
