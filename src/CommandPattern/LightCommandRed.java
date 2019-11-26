public class LightCommandRed implements Command {

    Light theLight;

    public LightCommandRed(Light newLight) {
        theLight = newLight;
    }

    @Override
    public void execute() {
        theLight.lightRed();
    }
}
