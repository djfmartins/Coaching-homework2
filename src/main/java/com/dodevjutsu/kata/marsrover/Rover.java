package com.dodevjutsu.kata.marsrover;

public class Rover {

    private int x;
    private int y;
    private String direction;

    public Rover(int x, int y, String direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;

        if (getClass() != object.getClass())
            return false;

        Rover other = (Rover) object;

        if (other.x != this.x)
            return false;
        if (other.y != this.y)
            return false;
        if (other.direction != this.direction)
            return false;
        return true;
    }
}
