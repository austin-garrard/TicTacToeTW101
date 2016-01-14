package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;
    private BufferedReader bufferedReader;
    private GameDisplay gameDisplay;
    private Map<Integer,Player> moves;
    private GameInput gameInput;

    @Before
    public void setup() {
        gameDisplay = mock(GameDisplay.class);
        gameInput = mock(GameInput.class);
        moves = mock(Map.class);
        game = new Game(gameDisplay, gameInput, moves);
    }
//
//    @Test
//    public void shouldDisplayInitialBoard() {
//        game.run();
//        verify(gameDisplay).drawGrid();
//    }

    @Test
    public void shouldPromptPlayerOne() {
        game.run();
        verify(gameDisplay).prompt(Player.One);
    }

    @Test
    public void shouldPromptPlayerTwo() {
        game.run();
        verify(gameDisplay).prompt(Player.Two);
    }

    @Test
    public void shouldMovePlayerOne() {
        game.move(Player.One, 3);
        verify(moves).put(3, Player.One);
    }

    @Test
    public void shouldMovePlayerTwo() {
        game.move(Player.Two, 4);
        verify(moves).put(4, Player.Two);
    }

//    @Test
//    public void shouldDisplayMessageWhenPlayerMovesIntoOccupiedLocation() {
//        moves.put(1, 1);
//        moves.put(1, 1);
//
//        verify(gameDisplay).printLocationErrorMessage();
//    }

}
