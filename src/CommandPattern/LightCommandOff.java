package CommandPattern;

public class LightCommandOff implements Command {

    Light theLight;

    public LightCommandOff(Light newLight) {
        theLight = newLight;
    }

    @Override
    public void execute() {
        theLight.lightOff();
    }
}
