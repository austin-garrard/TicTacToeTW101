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
        gameDisplay.prompt(player);
        int location = gameInput.readDesiredLocation();
        move(player, location);
        gameDisplay.drawGrid();
    }

    private void move(Player player, int location) {
        if(moves.containsKey(location)) {
            gameDisplay.drawErrorMessage();
        }
        else {
            moves.put(location, player);
        }
    }

}
