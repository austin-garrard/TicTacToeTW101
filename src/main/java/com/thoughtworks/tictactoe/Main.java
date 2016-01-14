package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> moves = new ArrayList<>();
        PrintStream printStream = System.out;
        GameDisplay gameDisplay = new GameDisplay(printStream, moves);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game(gameDisplay, bufferedReader, moves);
        game.run();
    }
}
