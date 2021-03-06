package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Player> moves = new HashMap<>();
        PrintStream printStream = System.out;
        GameDisplay gameDisplay = new GameDisplay(printStream, moves);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        GameInput gameInput = new GameInput(bufferedReader);
        Game game = new Game(gameDisplay, gameInput, moves);

        GameLoop gameLoop = new GameLoop(game, gameDisplay);
        gameLoop.run();
    }
}
