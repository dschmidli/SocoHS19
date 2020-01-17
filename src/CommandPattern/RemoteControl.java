public class RemoteControl {

    Command theCommand;

    public RemoteControl(Command newCommand) {
        theCommand = newCommand;
    }

    public void pressButton() {
        theCommand.execute();
    }

    public static void main(String[] args) {
        Light newLight = new Light();

        LightCommandOn lightOn = new LightCommandOn(newLight);
        RemoteControl pressed = new RemoteControl(lightOn);
        pressed.pressButton();

        LightCommandRed lightRed = new LightCommandRed(newLight);
        pressed = new RemoteControl(lightRed);
        pressed.pressButton();

        LightCommandYellow lightYellow = new LightCommandYellow(newLight);
        pressed = new RemoteControl(lightYellow);
        pressed.pressButton();

        LightCommandOff lightOff = new LightCommandOff(newLight);
        pressed = new RemoteControl(lightOff);
        pressed.pressButton();

        lightRed = new LightCommandRed(newLight);
        pressed = new RemoteControl(lightRed);
        pressed.pressButton();
    }
}
