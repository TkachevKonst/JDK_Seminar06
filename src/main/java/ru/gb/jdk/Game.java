package ru.gb.jdk;

import java.util.HashMap;

public class Game {

    private final int COUNT_GAME = 1000;
    private Player player;
    private Showman showman = new Showman();
    private GameArea gameArea;
    private HashMap<Integer, String> map = new HashMap<>();
    private double win;
    private DataFile file = new DataFile();

    public Game(String name, int i) {

        player = new Player(name, i);
        playGame();
    }

    private void playGame() {
        double countWin = 0;
        if (player.getType() == 0) {
            for (int i = 0; i < COUNT_GAME; i++) {
                gameArea = new GameArea();
                int changeDoor = player.changeDoor(player.choiceDoor(gameArea.area.length),
                        showman.choiceShowman(player, gameArea), gameArea.area.length);
                if (gameArea.area[changeDoor]) {
                    countWin++;
                    map.put(i + 1, "Победа");
                    file.saveInfo((i + 1) + " - Победа", player.getName());
                } else {
                    map.put(i + 1, "Поражение");
                    file.saveInfo((i + 1) + " - Поражение", player.getName());
                }
            }
            for (int i = 0; i < COUNT_GAME; i++) {
                System.out.println(map.get(i));
            }
            win = (countWin / COUNT_GAME) * 100;
            System.out.println("Процент побед " + player.getName() + " = " + win + "%.");
        } else {
            for (int i = 0; i < COUNT_GAME; i++) {
                gameArea = new GameArea();
                int choiceDoor = player.choiceDoor(gameArea.area.length);
                if (gameArea.area[choiceDoor]) {
                    countWin++;
                    map.put(i + 1, "Победа");
                    file.saveInfo((i + 1) + " - Победа", player.getName());
                } else {
                    map.put(i + 1, "Поражение");
                    file.saveInfo((i + 1) + " - Поражение", player.getName());
                }
            }
            for (int i = 0; i < COUNT_GAME; i++) {
                System.out.println(map.get(i));
            }
            win = (countWin / COUNT_GAME) * 100;
            System.out.println("Процент побед " + player.getName() + " = " + win + "%.");
        }
    }


}
