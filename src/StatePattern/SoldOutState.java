package StatePattern;

public class SoldOutState implements GumballMachineState {
    GumballMachine gbMachine;

    public SoldOutState(GumballMachine newGbM) {
        gbMachine = newGbM;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
