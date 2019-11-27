package StatePattern;

public class GumballMachine {
    GumballMachineState soldOutState;
    GumballMachineState noQuarterState;
    GumballMachineState hasQuarterState;
    GumballMachineState soldState;

    GumballMachineState state;
    int count = 0;

    public GumballMachine(int c) {
        noQuarterState = new NoQuarterState(this);

        state = soldOutState;
        if (count > 0 ) {
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
