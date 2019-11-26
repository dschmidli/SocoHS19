import java.util.concurrent.TimeUnit;

public class Light {

    private String color = "yellow";
    private boolean isOn = false;

    public void lightOn() {
        System.out.println("Light is ON");
        isOn = true;
    }

    public void lightOff() {
        System.out.println("Light is OFF");
        isOn = false;
    }

    public void lightRed() {
        if (isOn) {
            color = "red";
            System.out.println("Light is RED");
        }
        else {
            System.err.println("You have to turn the light on first!");
        }
    }

    public void lightYellow() {
        if (isOn) {
            color = "yellow";
            System.out.println("Light is YELLOW");
        }
        else {
            System.err.println("You have to turn the light on first!");
        }
    }

    public void lightTimer(int newt) {
        int t = newt;
        for (int i=0; i < t; i++) {
            System.out.println(i);
        }

    }
}
