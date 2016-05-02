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

    public void receive(String commands)
    {
        for (int i = 0; i < commands.length(); i++) {
            String newCommand = commands.substring(i, i + 1);

            if (newCommand == "l") {
                if (direction == "N") {
                    direction = "W";
                } else if (direction == "S") {
                    direction = "E";
                } else if (direction == "W") {
                    direction = "N";
                } else {
                    direction = "S";
                }
            } else if (newCommand == "r") {
                if (direction == "N") {
                    direction = "E";
                } else if (direction == "S") {
                    direction = "W";
                } else if (direction == "W") {
                    direction = "S";
                } else {
                    direction = "N";
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
        if (other.direction != this.direction)
            return false;
        return true;
    }
}
