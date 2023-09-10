import java.util.ArrayList;

public class Flock implements Quackable{
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Quackable leader = null;
        for (Quackable quacker : quackers){
            if (leader == null) {
                leader = quacker;
                for (int i = 0; i < 3; i++){
                    leader.quack();
                }
            }
            quacker.quack();
        }
    }
}
