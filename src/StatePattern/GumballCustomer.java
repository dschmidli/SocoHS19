package StatePattern;

public class GumballCustomer {

    public static void main(String[] args) {
        GumballMachine gb = new GumballMachine(1);
        System.out.println(gb.count);
        gb.insertQuarter();
        System.out.println(gb.count);
        gb.ejectQuarter();
        System.out.println(gb.count);
        gb.insertQuarter();
        System.out.println(gb.count);
        gb.turnCrank();
        System.out.println(gb.count);
        gb.insertQuarter();
        System.out.println(gb.count);
    }
}
