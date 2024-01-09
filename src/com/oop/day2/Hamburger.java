package com.oop.day2;

public class Hamburger {
    private final int bun;
    private final int patty;
    private final int tomato;
    private final int cheese;
    private final int bacon;

    public static class Builder {
        private final int bun;
        private final int patty;
        private int tomato;
        private int cheese;
        private int bacon;

        public Builder(int bun, int patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public Builder tomato(int val) {
            tomato = val;
            return this;
        }
        public Builder cheese(int val) {
            cheese = val;
            return this;
        }
        public Builder bacon(int val) {
            bacon = val;
            return this;
        }

        public Hamburger build() {
            return new Hamburger(this);
        }
    }

    private Hamburger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.tomato = builder.tomato;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
    }

    public void printHamburger() {
        System.out.printf("bun(%d) patty(%d) tomato(%d) bacon(%d) cheese(%d)\n",
                            Hamburger.this.bun, Hamburger.this.patty, Hamburger.this.tomato,
                            Hamburger.this.bacon, Hamburger.this.cheese);
    }

}
