package com.dodevjutsu.kata.marsrover;

public class Rover {

    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, String direction)
    {
        this.x = x;
        this.y = y;
        this.direction = Direction.create(direction);
    }

    public void receive(String commands)
    {
        for (int i = 0; i < commands.length(); i++) {
            String newCommand = commands.substring(i, i + 1);

            if (newCommand == "l") {
                direction = direction.rotateLeft();
            } else if (newCommand == "r") {
                direction = direction.rotateRight();
            }
        }
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

        if (!direction.equals(other.direction))
            return false;
        return true;
    }
}
