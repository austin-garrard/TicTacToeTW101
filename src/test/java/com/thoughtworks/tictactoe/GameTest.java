package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;
    private BufferedReader bufferedReader;
    private GameDisplay gameDisplay;
    private Collection<Integer> moves;
    private GameInput gameInput;

    @Before
    public void setup() {
        gameDisplay = mock(GameDisplay.class);
        gameInput = mock(GameInput.class);
        moves = mock(Collection.class);
        game = new Game(gameDisplay, null, moves);
    }

    @Test
    public void shouldDisplayInitialBoard() {
        game.run();
        verify(gameDisplay).drawGrid();
    }

    @Test
    public void shouldPromptPlayer() {
        game.run();
        verify(gameDisplay).promptPlayer();
    }

    @Test
    public void shouldMakeMoveWhenMoveIsInTheFirstRow() {
        game.move(3);
        verify(moves).add(3);
    }

}
