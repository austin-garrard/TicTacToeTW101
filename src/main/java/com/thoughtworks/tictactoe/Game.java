package com.thoughtworks.tictactoe;

import java.util.Map;

public class Game {
    private GameDisplay gameDisplay;
    private GameInput gameInput;
    private Map<Integer, Player> moves;

    public Game(GameDisplay gameDisplay, GameInput gameInput, Map<Integer, Player> moves) {
        this.gameDisplay = gameDisplay;
        this.gameInput = gameInput;
        this.moves = moves;
    }

    public void turn(Player player) {
        int location;
        do {
            gameDisplay.prompt(player);
            location = gameInput.readDesiredLocation();
        } while(!move(player, location));

        gameDisplay.drawGrid();
    }

    private boolean move(Player player, int location) {
        if(moves.containsKey(location)) {
            gameDisplay.drawErrorMessage();
            return false;
        }
        else {
            moves.put(location, player);
            return true;
        }
    }

}
