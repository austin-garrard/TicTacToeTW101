package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private Game game;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        game = new Game(printStream, bufferedReader);
    }


    @Test
    public void shouldReadDesiredLocation() throws IOException{
        when(bufferedReader.readLine()).thenReturn("1");
        int desiredLocation = game.readDesiredLocation();
        assertThat(desiredLocation, is(1));

    }

    @Test
    public void shouldMakeMoveWhenMoveIsInTheFirstRow() {
        game.move(3);
        verify(printStream).println("   |   | X \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   ");
    }

}
