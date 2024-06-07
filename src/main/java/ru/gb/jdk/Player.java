package ru.gb.jdk;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter

public class Player {

    private Random random = new Random();



    private String name;

    private String typePlayer;

    private int type;

    public Player(String name, int i) {
        this.name = name;
        if (i == 0) {
            typePlayer = "меняет выбор";
            type = 0;
        } else {
            typePlayer = "не меняет выбор";
            type = 1;
        }
    }

    @Override
    public String toString() {
        return String.format(name + ", он " + typePlayer);
    }

    public int choiceDoor(int countDoors) {
        int i = random.nextInt(countDoors);
        return i;
    }

    public int changeDoor(int choiceDoor, int choiceShowman, int countDoor) {

        while (true) {
            int i = random.nextInt(countDoor);
            if (i != choiceDoor && i != choiceShowman) {
                return i;
            }
        }
    }


}
