package StatePattern;

public class HasQuarterState implements GumballMachineState {
    GumballMachine gbMachine;

    public HasQuarterState(GumballMachine newGbM) {
        gbMachine = newGbM;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There is already a quarter inserted, please turn the crank!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("The process was interrupted!");
        gbMachine.setState(gbMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning crank successfully!");
        gbMachine.setState(gbMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Please turn the crank first");
    }
}
