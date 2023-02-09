import java.util.ArrayList;

public class Nation {
    protected final ArrayList<Nation> friendlyNations;
    protected final ArrayList<Nation> opposingNations;
    protected int population;
    protected final String name;
    protected double money;
    protected boolean stable = true;
    protected int morale;
    protected String leader;


    public Nation(ArrayList<Nation> friendlyNations, ArrayList<Nation> opposingNations, int population, String name,
                     double money, int morale, String leader) {
        this.friendlyNations = friendlyNations;
        this.opposingNations = opposingNations;
        this.population = population;
        this.name = name;
        this.money = money;
        this.morale = morale;
        this.leader = leader;
    }

    public void declareWar(Nation nation) {
        opposingNations.add(nation);
    }

    public void declarePeace(Nation nation) {
        friendlyNations.add(nation);
    }

    public void nuke(Nation nation) {
        nation.setStability(false);
    }

    public void construct(String thing) {
        int cost = thing.length() * 10;
        money -= cost;
        population += cost * 2;
    }

    protected void setStability(boolean b) {
        stable = b;
    }


}
