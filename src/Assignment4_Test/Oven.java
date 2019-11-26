import java.util.concurrent.TimeUnit;

public class Oven {
    private String name;
    private boolean status;
    private boolean timerStatus;


    public Oven() {
        name = "Oven";
        status = false;
    }

    public String getName() {
        return name;
    }
    public boolean isOn() {
        return status;
    }

    public boolean isTimerOn() {
        return timerStatus;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        if (!timerStatus) {
            status = false;
        }
        else {
            System.out.println("Timer not finished yet.");
        }

    }

    public void setTimer(int t) {
        if (status) {
            timerStatus = true;
            try {
                TimeUnit.SECONDS.sleep(t);
            } catch (InterruptedException e) {
                System.err.println("An error occurred!");
            }

        }
        else {
            System.out.println("You have to turn the oven on first.");
        }


        System.out.println("Time is over!!!");
    }
}
