package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoverEqualityTest {

    @Test
    public void testEquals() {
        Rover rover_1 = new Rover(1,1,"A");
        Rover rover_2 = new Rover(1,1,"A");

        assertEquals(rover_1, rover_1);
        assertEquals(rover_1, rover_2);
    }

    @Test
    public void testNotEquals() {
        Rover rover_1 = new Rover(1,1,"A");
        Rover rover_2 = new Rover(1,1,"B");
        Rover rover_3 = new Rover(1,0,"B");
        Rover rover_4 = new Rover(0,1,"B");

        assertNotEquals(rover_1, rover_2);
        assertNotEquals(rover_1, rover_3);
        assertNotEquals(rover_1, rover_4);
    }
}
