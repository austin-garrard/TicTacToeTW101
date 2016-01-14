package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game(printStream, bufferedReader);
        game.draw();
        game.prompt();
        int playerOneMove = game.readDesiredLocation();
        game.move(playerOneMove);
    }
}
