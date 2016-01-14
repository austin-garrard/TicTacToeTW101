package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameDisplayTest {


    private PrintStream printStream;
    private GameDisplay gameDisplay;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        gameDisplay = new GameDisplay(printStream);
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



}
