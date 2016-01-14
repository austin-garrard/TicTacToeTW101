package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class GameDisplay {
    private PrintStream printStream;

    public GameDisplay(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void promptPlayer() {
        printStream.println("Player 1, enter a move: ");
    }

    public void drawGrid() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   ");
    }
}
