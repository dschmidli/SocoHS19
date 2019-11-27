package StatePattern;

public interface GumballMachineState {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

}
