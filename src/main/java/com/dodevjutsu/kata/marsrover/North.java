package com.dodevjutsu.kata.marsrover;

public class North extends Direction {

    public North ()
    {
        super(NORTH);
    }

    @Override
    public Direction rotateLeft() {
        return Direction.create(WEST);
    }

    @Override
    public Direction rotateRight() {
        return Direction.create(EAST);
    }
}
