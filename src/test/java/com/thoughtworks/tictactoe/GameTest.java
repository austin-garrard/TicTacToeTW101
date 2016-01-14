package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

public class GameTest {

    private Game game;
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
        when(moves.containsKey(anyInt())).thenReturn(true)
                                         .thenReturn(false);

        game.turn(Player.One);

        verify(gameDisplay).drawErrorMessage();
    }


    @Test
    public void shouldGivePlayerAnotherTurnWhenLocationAlreadyTaken() {
        when(gameInput.readDesiredLocation()).thenReturn(3);
        when(moves.containsKey(anyInt())).thenReturn(true)
                                         .thenReturn(false);

        game.turn(Player.Two);

        verify(moves).put(3, Player.Two);
    }



}
