package com.dodevjutsu.kata.marsrover;

abstract class Direction {

    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String EAST  = "E";
    public static final String WEST  = "W";

    private String direction;

    public Direction (String direction)
    {
        this.direction = direction;
    }

    static Direction create(String newDirection)
    {
        if (newDirection.equals(NORTH))
            return new North();
        else if (newDirection.equals(SOUTH))
            return new South();
        else if (newDirection.equals(WEST))
            return new West();
        else
            return new East();
    }

    public abstract Direction rotateLeft();
    public abstract Direction rotateRight();

    @Override
    public boolean equals(Object object)
    {
        if (this == object)
            return true;

        if (getClass() != object.getClass())
            return false;

        return true;
    }
}
