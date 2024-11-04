// Main класс для запуска Монти Холла в цикле

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGame {

    public static void main(String[] args) {
        Player gamer = new Player("Игрок", true);
        int statisticWin = 0;
        int numberOfGames = 3; // Вы можете изменить количество игр

        for (int step = 0; step < numberOfGames; step++) {
            Game game = new Game(gamer, getDoors());

            if (game.round(0).isPrize()) {
                statisticWin++;
            }
        }

        System.out.println("Из " + numberOfGames + " игр игрок выиграл " + statisticWin);
    }

    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}
