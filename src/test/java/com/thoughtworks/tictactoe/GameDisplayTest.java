package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameDisplayTest {


    private PrintStream printStream;
    private GameDisplay gameDisplay;
    private Collection<Integer> moves;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        moves = new ArrayList<>();
        gameDisplay = new GameDisplay(printStream, moves);
    }

    @Test
    public void shouldPromptPlayerForMove() {
        gameDisplay.promptPlayer();
        verify(printStream).println(contains("enter a move: "));

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
        moves.add(1);

        gameDisplay.drawGrid();

        verify(printStream).println(" X |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");

    }

    @Test
    public void shouldDrawGridWhenMoveIsTwo() {
        moves.add(2);

        gameDisplay.drawGrid();

        verify(printStream).println("   | X |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   ");

    }






}
