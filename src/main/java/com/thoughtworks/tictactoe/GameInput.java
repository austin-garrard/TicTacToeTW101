package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class GameInput {
    private BufferedReader bufferedReader;

    public GameInput(BufferedReader bufferedReader) {

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
}
