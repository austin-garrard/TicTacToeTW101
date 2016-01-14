package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameDisplayTest {


    private PrintStream printStream;
    private GameDisplay gameDisplay;
    private Map<Integer,Integer> moves;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        moves = new HashMap<>();
        gameDisplay = new GameDisplay(printStream, moves);
    }

    @Test
    public void shouldPromptPlayerOneForMove() {
        gameDisplay.prompt(Player.One);
        verify(printStream).println(contains("Player 1, enter a move: "));

    }

    @Test
    public void shouldPromptPlayerTwoForMove() {
        gameDisplay.prompt(Player.Two);
        verify(printStream).println(contains("Player 2, enter a move: "));

    }

    @Test
    public void shouldDrawGridWhenEmptyGrid() {
        gameDisplay.drawGrid();
        verify(printStream).println("   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");
    }

    @Test
    public void shouldDrawGridWhenMoveIsOne() {
        moves.put(1, 1);

        gameDisplay.drawGrid();

        verify(printStream).println(" X |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");

    }

    @Test
    public void shouldDrawGridWhenMoveIsTwo() {
        moves.put(2, 1);

        gameDisplay.drawGrid();

        verify(printStream).println("   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }

    @Test
    public void shouldDrawXWhenPlayerOneMove() {
        moves.put(1, 1);

        gameDisplay.drawGrid();

        verify(printStream).println(" X |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");

    }

    @Test
    public void shouldDrawOWhenPlayerTwoMove() {
        moves.put(1, 2);

        gameDisplay.drawGrid();

        verify(printStream).println(" O |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }






}
