package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;

public class Game {
    private GameDisplay gameDisplay;
    private BufferedReader bufferedReader;
    private Collection<Integer> moves;

    public Game(GameDisplay gameDisplay, BufferedReader bufferedReader, Collection<Integer> moves) {
        this.gameDisplay = gameDisplay;

        this.bufferedReader = bufferedReader;
        this.moves = moves;
    }


    public int readDesiredLocation() {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        }
        catch(IOException exception) {
            return -1;
        }
    }

//    public void move(int location) {
//        printStream.println("   |   | X \n" +
//                            "-----------\n" +
//                            "   |   |   \n" +
//                            "-----------\n" +
//                            "   |   |   ");
//    }

    public void run() {
        gameDisplay.drawGrid();
        gameDisplay.promptPlayer();
        int location = readDesiredLocation();
        move(location);
        gameDisplay.drawGrid();
    }

    public void move(int location) {
        moves.add(3);
    }
}
