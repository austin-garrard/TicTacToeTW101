package com.thoughtworks.tictactoe;

import java.util.Map;

public class Game {
    private GameDisplay gameDisplay;
    private GameInput gameInput;
    private Map<Integer, Integer> moves;

    public Game(GameDisplay gameDisplay, GameInput gameInput, Map<Integer, Integer> moves) {
        this.gameDisplay = gameDisplay;
        this.gameInput = gameInput;
        this.moves = moves;
    }



    public void run() {
        gameDisplay.drawGrid();

        gameDisplay.prompt(Player.One);
        int location = gameInput.readDesiredLocation();
        movePlayerOne(location);
        gameDisplay.drawGrid();

        gameDisplay.prompt(Player.Two);
        location = gameInput.readDesiredLocation();
        movePlayerTwo(location);
        gameDisplay.drawGrid();

    }

    public void movePlayerOne(int location) {
        moves.put(location, 1);
    }

    public void movePlayerTwo(int location) {
        moves.put(location, 2);
    }
}
