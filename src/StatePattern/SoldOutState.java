package StatePattern;

public class SoldOutState implements GumballMachineState {
    GumballMachine gbMachine;

    public SoldOutState(GumballMachine newGbM) {
        gbMachine = newGbM;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, the gumball machine is sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, the gumball machine is sold out!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, the gumball machine is sold out!");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, the gumball machine is sold out!");
    }
}
