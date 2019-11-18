package Assignment4_Test;

public class OvenOnCommand implements Command {
    Oven oven;

    public OvenOnCommand(Oven newOven) {
        oven = newOven;
    }

    @Override
    public void execute() {
        oven.turnOn();
    }
}
