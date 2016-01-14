package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameLoopTest {

    private Game game;
    private GameLoop gameLoop;
    private GameDisplay gameDisplay;

    @Before
    public void setup() {
        game = mock(Game.class);
        gameDisplay = mock(GameDisplay.class);
        gameLoop = new GameLoop(game, gameDisplay);
    }

    @Test
    public void shouldDisplayInitialGrid() {
        gameLoop.run();
        verify(gameDisplay).drawGrid();
    }

    @Test
    public void shouldGivePlayerOneATurn() {
        gameLoop.run();
        verify(game).turn(Player.One);
    }

    @Test
    public void shouldGivePlayerTwoATurn() {
        gameLoop.run();
        verify(game).turn(Player.Two);
    }




}
