package com.thoughtworks.tictactoe;

public class GameLoop {
    private Game game;
    private GameDisplay gameDisplay;

    public GameLoop(Game game, GameDisplay gameDisplay) {
        this.game = game;
        this.gameDisplay = gameDisplay;
    }

    public void run() {
        gameDisplay.drawGrid();

        game.turn(Player.One);

        game.turn(Player.Two);
    }
}
