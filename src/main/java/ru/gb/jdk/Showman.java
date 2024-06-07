package ru.gb.jdk;

import java.util.Random;

public class Showman {
    private Random random = new Random();


    public int choiceShowman(Player player, GameArea gameArea){
        while (true){
            int choiceShowman = random.nextInt(gameArea.area.length);
            if (choiceShowman != player.choiceDoor(gameArea.area.length) && !gameArea.area[choiceShowman]){
                return choiceShowman;
            }
        }

    }


}
