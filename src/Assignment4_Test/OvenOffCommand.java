package Assignment4_Test;

public class OvenOffCommand implements Command {
    Oven oven;

    public OvenOffCommand(Oven newOven) {
        oven = newOven;
    }

    @Override
    public void execute() {
        oven.turnOff();
    }
}
