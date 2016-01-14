package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Game(PrintStream printStream, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void draw() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   ");
    }

    public void prompt() {
        printStream.println("Player 1, enter a move: ");
    }

    public int readDesiredLocation() {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        }
        catch(IOException exception) {
            return -1;
        }
    }

}
