package com.dodevjutsu.kata.marsrover;

public class South extends Direction {

    public South()
    {
        super(SOUTH);
    }

    @Override
    public Direction rotateLeft() {
        return Direction.create(EAST);
    }

    @Override
    public Direction rotateRight() {
        return Direction.create(WEST);
    }
}
