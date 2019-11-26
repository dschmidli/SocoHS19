public class LightCommandOn implements Command {

    Light theLight;

    public LightCommandOn(Light newLight) {
        theLight = newLight;
    }

    @Override
    public void execute() {
        theLight.lightOn();
    }
}
