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

            if (newCommand.equals("l")) {
                direction = direction.rotateLeft();
            } else if (newCommand.equals("r")) {
                direction = direction.rotateRight();
            } else if (newCommand.equals("f")) {
                if (direction instanceof North) {
                    y = y + 1;
                } else if (direction instanceof South) {
                    y = y - 1;
                } else if (direction instanceof West) {
                    x = x - 1;
                } else {
                    x = x + 1;
                }
            } else if (newCommand.equals("b")) {
                if (direction instanceof North) {
                    y = y - 1;
                } else if (direction instanceof South) {
                    y = y + 1;
                } else if (direction instanceof West) {
                    x = x + 1;
                } else {
                    x = x - 1;
                }
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
