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
        if(moves.size() > 0) {
            String output = "";
            for(int i = 1; i <= 9; i++) {
                if(moves.contains(i)) {
                    output += " X ";
                } else {
                    output += "   ";
                }
                if(i % 3 == 0) {
                    if(i < 7) {
                        output += "\n-----------\n";
                    }
                } else {
                    output += "|";
                }
            }
            printStream.println(output);
//            printStream.println(" X |   |   \n" +
//                                "-----------\n" +
//                                "   |   |   \n" +
//                                "-----------\n" +
//                                "   |   |   ");
        }
        else {
            printStream.println("   |   |   \n" +
                    "-----------\n" +
                    "   |   |   \n" +
                    "-----------\n" +
                    "   |   |   ");
        }
    }
}
