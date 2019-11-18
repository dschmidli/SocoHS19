public class Oven {
    private String name;
    private boolean status;
    private boolean timerStatus;


    public Oven() {
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
        status = false;
    }

    public void setTimer(int t) {
        timerStatus = true;
        for(int i = 0; i < t*1000; i++) {
            if (i%1000 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Time is over!!!");
    }
}
