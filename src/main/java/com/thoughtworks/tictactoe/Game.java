package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Collection;

public class Game {
    private GameDisplay gameDisplay;
    private GameInput gameInput;
    private Collection<Integer> moves;

    public Game(GameDisplay gameDisplay, GameInput gameInput, Collection<Integer> moves) {
        this.gameDisplay = gameDisplay;
        this.gameInput = gameInput;
        this.moves = moves;
    }







    public void run() {
        gameDisplay.drawGrid();
        gameDisplay.promptPlayer();
        int location = gameInput.readDesiredLocation();
        move(location);
        gameDisplay.drawGrid();
    }

    public void move(int location) {
        moves.add(location);
    }
}
