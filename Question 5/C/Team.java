import java.util.ArrayList;
import java.util.List;

class Team {
    private int code;
    private List<Player> players;

    public Team() {
        this.code = 0;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player added: " + player.getName());
    }

    public void displayTeam() {
        System.out.println("Team Code: " + code + ", Players:");
        for (Player player : players) {
            System.out.println("- " + player.getName() + " (Expert: " + player.isExpert() + ")");
        }
    }
}
