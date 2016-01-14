package com.thoughtworks.tictactoe;

public enum Player {
    One {
        public String getName() {
            return "Player 1";
        }
    },

    Two {
        public String getName() {
            return "Player 2";
        }
    };

    public abstract String getName();
}
