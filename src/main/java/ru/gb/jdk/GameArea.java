package ru.gb.jdk;

import java.util.Random;

public class GameArea {


    private Random random = new Random();

    private final int SIZE_AREA = 3;

    boolean [] area = new boolean[SIZE_AREA];

    public GameArea(){
        for (int i = 0; i < SIZE_AREA; i++) {
            area[i] = false;
        }
        int numberTrue = random.nextInt(SIZE_AREA);
        area[numberTrue] = true;
    }



}
