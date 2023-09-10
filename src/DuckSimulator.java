public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallard = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redhead = new QuackCounter(new QuackEcho(new RedHeadDuck()));
        Quackable duck = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubber = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));

        System.out.println("\nDuck Simulator");
        simulate(mallard);
        simulate(redhead);
        simulate(duck);
        simulate(rubber);
        simulate(goose);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}