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
import static org.mockito.Matchers.anyInt;
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

    @Test
    public void shouldPromptPlayerDuringTurn() {
        game.turn(Player.One);
        verify(gameDisplay).prompt(Player.One);
    }

    @Test
    public void shouldReaderInputDuringTurn() {
        game.turn(Player.One);
        verify(gameInput).readDesiredLocation();
    }

    @Test
    public void shouldMovePlayerDuringTurnWhenLocationIsFree() {
        when(gameInput.readDesiredLocation()).thenReturn(3);
        game.turn(Player.Two);
        verify(moves).put(3, Player.Two);
    }

    @Test
    public void shouldDrawErrorMessageDuringTurnWhenLocationIsTaken() {
        when(moves.containsKey(anyInt())).thenReturn(true);

        game.turn(Player.One);

        verify(gameDisplay).drawErrorMessage();
    }

}
