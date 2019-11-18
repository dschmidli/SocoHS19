package Assignment4_Test;

public class OvenTimerCommand implements CommandInt{
    Oven oven;

    public OvenTimerCommand(Oven newOven) {
        oven = newOven;
    }

    @Override
    public void execute() {
        this.execute(5);
    }

    @Override
    public void execute(int i) {
        oven.setTimer(i);
    }
}
