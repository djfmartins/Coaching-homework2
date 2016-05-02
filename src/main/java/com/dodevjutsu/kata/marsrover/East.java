package com.dodevjutsu.kata.marsrover;

public class East extends Direction {

    public East()
    {
        super(EAST);
    }

    @Override
    public Direction rotateLeft() {
        return Direction.create(SOUTH);
    }

    @Override
    public Direction rotateRight() {
        return Direction.create(NORTH);
    }
}
