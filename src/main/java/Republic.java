import java.util.ArrayList;
import java.util.Random;

public class Republic extends Democracy {

    private final ArrayList<String> senateMembers;
    private final Random rand = new Random();

    public Republic(ArrayList<Nation> friendlyNations, ArrayList<Nation> opposingNations, int population, String name,
                    double money, int morale, String leader, ArrayList<String> rights, ArrayList<String> senateMembers) {
        super(friendlyNations, opposingNations, population, name, money, morale, leader, rights);
        this.senateMembers = senateMembers;
    }

    public void electSenator(String name) {
        senateMembers.add(name);
    }

    @Override
    public void nuke(Nation nation) {
        if(rand.nextInt(2) == 1) {
            super.nuke(nation);
        } else {
            setStability(false);
        }
    }
}
