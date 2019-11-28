package StatePattern;

public class SoldState implements GumballMachineState {
    GumballMachine gbMachine;

    public SoldState(GumballMachine newGbM) {
        gbMachine = newGbM;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, the machine is dispensing your gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, the machine is dispensing your gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait, the machine is dispensing your gumball");
    }

    @Override
    public void dispense() {
        System.out.println("Please take your gumball!");
        gbMachine.count--;
        gbMachine.setState(gbMachine.getNoQuarterState());
    }
}
