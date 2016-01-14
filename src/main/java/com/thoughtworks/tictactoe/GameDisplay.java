package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.Map;

public class GameDisplay {
    private PrintStream printStream;
    private Map<Integer, Player> moves;

    public GameDisplay(PrintStream printStream, Map<Integer, Player> moves) {

        this.printStream = printStream;
        this.moves = moves;
    }

    public void drawGrid() {
        String output = "";
        for(int cell = 1; cell <= 9; cell++) {
            output += drawCell(cell);
            output += drawDivider(cell);
        }
        printStream.println(output);

    }

    private String drawDivider(int cell) {
        String output = "";
        if(cell % 3 == 0) {
            output += drawHorizontalDivider(cell);
        } else {
            output += "|";
        }
        return output;
    }

    private String drawHorizontalDivider(int cell) {
        String output = "";
        if(cell < 7) {
            output += "\n-----------\n";
        }
        return output;
    }

    private String drawCell(int cell) {
        String output = "";
        if(moves.containsKey(cell)) {
            output += drawPlayer(cell);
        } else {
            output += "   ";
        }
        return output;
    }

    private String drawPlayer(int cell) {
        String output = " ";
        output += moves.get(cell).draw();
        output += " ";
        return output;
    }

    public void prompt(Player player) {
        printStream.println(player.getName() + ", enter a move: ");
    }

    public void drawErrorMessage() {
        printStream.println("Location already taken.");
    }
}
