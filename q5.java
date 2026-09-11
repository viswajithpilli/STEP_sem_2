import java.util.Arrays;

public class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    public static String draftAndRank(Player[] players) {
        Player[] draftablePool = new Player[players.length];
        int count = 0;
        
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftablePool[count++] = p;
            }
        }
        
        Player[] finalDraftable = Arrays.copyOf(draftablePool, count);
        Arrays.sort(finalDraftable);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < finalDraftable.length; i++) {
            result.append(i + 1).append(". ").append(finalDraftable[i].name);
            if (i < finalDraftable.length - 1) {
                result.append(" | ");
            }
        }
        
        return result.toString();
    }
}
