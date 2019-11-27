package StatePattern;

public class NoQuarterState implements GumballMachineState {
    GumballMachine gbMachine;

    public NoQuarterState(GumballMachine newGbM) {
        gbMachine = newGbM;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserted Quarter successfully!");
        gbMachine.setState(gbMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there is no quarter!");
    }

    @Override
    public void dispense() {
        System.out.println("You need to insert a quarter first!");
    }
}
