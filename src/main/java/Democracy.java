import java.util.ArrayList;

public class Democracy extends Nation{
    private final ArrayList<String> rights;

    public Democracy(ArrayList<Nation> friendlyNations, ArrayList<Nation> opposingNations, int population, String name,
                     double money, int morale, String leader, ArrayList<String> rights) {
        super(friendlyNations, opposingNations, population, name, money, morale, leader);
        this.rights = rights;
    }

    @Override
    public void construct(String thing) {
        morale += thing.length() * 10;
    }

    public void electLeader(String leaderName) {
        leader = leaderName;
    }
}
