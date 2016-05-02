package com.dodevjutsu.kata.marsrover;

public class West extends Direction {

    public West()
    {
        super(WEST);
    }

    @Override
    public Direction rotateLeft() {
        return Direction.create(NORTH);
    }

    @Override
    public Direction rotateRight() {
        return Direction.create(SOUTH);
    }
}
