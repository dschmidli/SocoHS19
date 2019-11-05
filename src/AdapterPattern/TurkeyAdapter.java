package AdapterPattern;

public class TurkeyAdapter implements Duck {
    public Turkey turkey;

    public TurkeyAdapter(Turkey newTurkey) {
        this.turkey = newTurkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);


        turkey.gobble();
        turkeyAdapter.quack();
    }
}
