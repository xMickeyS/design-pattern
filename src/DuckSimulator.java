import java.util.ArrayList;
import java.util.Iterator;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        System.out.println("\nDuck Simulator");
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulate(duckFactory);

        System.out.println("=============");
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        simulate(countingDuckFactory);
        System.out.println(QuackCounter.getQuacks());

        System.out.println("=============");
        AbstractDuckFactory countingEchoDuckFactory = new CountingEchoDuckFactory();
        simulate(countingEchoDuckFactory);
        System.out.println(QuackCounter.getQuacks());

        System.out.println("=============");
        Flock flock = new Flock();
        flock.add(new RedHeadDuck());
        flock.add(new MallardDuck());
        flock.add(new PigeonAdapter(new Pigeon()));
        flock.add(new GooseAdapter(new Goose()));
        flock.quack();

    }

    void simulate(AbstractDuckFactory abstractDuckFactory){
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        simulate(mallardDuck); /* Quack */
        simulate(redheadDuck); /* Quack */
        simulate(duckCall); /* Kwak */
        simulate(rubberDuck); /* Squeak */
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}