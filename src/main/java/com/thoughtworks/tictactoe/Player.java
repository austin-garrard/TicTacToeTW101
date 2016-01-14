package com.thoughtworks.tictactoe;

public enum Player {
    One {
        public String getName() {
            return "Player 1";
        }
        public String draw() { return "X"; }
    },

    Two {
        public String getName() {
            return "Player 2";
        }
        public String draw() { return "O"; }
    };

    public abstract String getName();
    public abstract String draw();
}
