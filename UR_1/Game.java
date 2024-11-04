package UR_1;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player;
    private List<Door> doors;

    // Constructor
    public Game(Player player, List<Door> doors) {
        this.player = player;
        this.doors = new ArrayList<>(doors); // Ensure a new list is created
    }

    // Method to play a round
    public Door round(int door) {
        if (!player.getRisk()) {
            return doors.get(door);
        } else {
            // Remove the selected door
            doors.remove(door); // Use index directly
            // Return the first door if it has a prize, otherwise the second
            return doors.get(0).isPrize() ? doors.get(0) : doors.get(1);
        }
    }
}
