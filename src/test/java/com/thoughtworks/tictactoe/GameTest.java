package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    @Test
    public void shouldDrawTheBoard() {
        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(printStream);
        game.draw();
        verify(printStream).println("   |   | \n" +
                                    "---------\n" +
                                    "   |   | \n" +
                                    "---------\n" +
                                    "   |   | ");
    }


}
