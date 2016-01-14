package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;

public class GameDisplay {
    private PrintStream printStream;
    private Map<Integer, Integer> moves;

    public GameDisplay(PrintStream printStream, Map<Integer, Integer> moves) {

        this.printStream = printStream;
        this.moves = moves;
    }

    public void drawGrid() {
        String output = "";
        for(int cell = 1; cell <= 9; cell++) {
            output += drawCell(cell);
            output += drawHorizontalDivider(cell);
        }
        printStream.println(output);

    }

    private String drawHorizontalDivider(int cell) {
        String output = "";
        if(cell % 3 == 0) {
            if(cell < 7) {
                output += "\n-----------\n";
            }
        } else {
            output += "|";
        }
        return output;
    }

    private String drawCell(int cell) {
        String output = "";
        if(moves.containsKey(cell)) {
            output += " "  + (moves.get(cell) == 1? "X":"O") + " ";
        } else {
            output += "   ";
        }
        return output;
    }

    public void promptPlayerOne() {
        printStream.println("Player 1, enter a move: ");
    }

    public void promptPlayerTwo() {
        printStream.println("Player 2, enter a move: ");
    }

    public void promptPlayer() {
        printStream.println("Player 1, enter a move: ");
    }
}
