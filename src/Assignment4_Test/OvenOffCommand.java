public class OvenOffCommand implements Command, Runnable{
    Oven oven;

    public OvenOffCommand(Oven newOven) {
        oven = newOven;
    }

    @Override
    public void execute() {
        oven.turnOff();
    }

    @Override
    public void run() {
        execute();
    }
}
