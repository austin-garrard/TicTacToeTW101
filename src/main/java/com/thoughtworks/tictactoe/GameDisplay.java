package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.Collection;

public class GameDisplay {
    private PrintStream printStream;
    private Collection<Integer> moves;

    public GameDisplay(PrintStream printStream, Collection<Integer> moves) {

        this.printStream = printStream;
        this.moves = moves;
    }

    public void promptPlayer() {
        printStream.println("Player 1, enter a move: ");
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
        if(moves.contains(cell)) {
            output += " X ";
        } else {
            output += "   ";
        }
        return output;
    }
}
