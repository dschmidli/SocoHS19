package StatePattern;

public class GumballMachine {
    private GumballMachineState soldOutState;
    private GumballMachineState noQuarterState;
    private GumballMachineState hasQuarterState;
    private GumballMachineState soldState;

    private GumballMachineState state;
    int count;

    public GumballMachine(int c) {
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        count = c;
        state = getSoldOutState();
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void setState(GumballMachineState state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public GumballMachineState getSoldOutState() {
        return soldOutState;
    }

    public GumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public GumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public GumballMachineState getSoldState() {
        return soldState;
    }
}
