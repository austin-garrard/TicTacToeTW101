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


    public int readDesiredLocation() {
        try {
            return Integer.parseInt(bufferedReader.readLine());
        }
        catch(IOException exception) {
            return -1;
        }
    }

    public void move(int location) {
        printStream.println("   |   | X \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   ");
    }
}
