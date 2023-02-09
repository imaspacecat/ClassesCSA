import java.util.ArrayList;
import java.util.Random;

public class Monarchy extends Nation {
    public Monarchy(ArrayList<Nation> friendlyNations, ArrayList<Nation> opposingNations, int population, String name,
                    double money, int morale, String leader) {
        super(friendlyNations, opposingNations, population, name, money, morale, leader);
    }

    public void execute(String name){
        String causeOfDeath;
        Random rand = new Random();
        int result = rand.nextInt(5);

        switch (result) {
            case 1 -> causeOfDeath = " was hanged and promptly died.";
            case 2 -> causeOfDeath = " forcibly fell off a cliff.";
            case 3 -> causeOfDeath = " stepped on a lego";
            default -> {
                causeOfDeath = " tried to be superman";
            }
        }

        System.out.println(name + causeOfDeath);
    }
}
