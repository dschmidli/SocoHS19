package CommandPattern;

public class LightCommandYellow implements Command {

    Light theLight;

    public LightCommandYellow(Light newLight) {
        theLight = newLight;
    }

    @Override
    public void execute() {
        theLight.lightYellow();
    }
}
