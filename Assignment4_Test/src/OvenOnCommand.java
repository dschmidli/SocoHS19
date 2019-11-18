public class OvenOnCommand implements Command, Runnable {
    Oven oven;

    public OvenOnCommand(Oven newOven) {
        oven = newOven;
    }

    @Override
    public void execute() {
        oven.turnOn();
    }

    @Override
    public void run() {
        execute();
    }
}
