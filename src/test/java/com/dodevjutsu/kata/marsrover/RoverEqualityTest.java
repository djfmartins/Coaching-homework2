package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RoverEqualityTest {

    @Test
    public void testEquals() {
        Rover rover_1 = new Rover(1,1,"N");
        Rover rover_2 = new Rover(1,1,"N");

        assertEquals(rover_1, rover_1);
        assertEquals(rover_1, rover_2);
    }

    @Test
    public void testNotEquals() {
        Rover rover_1 = new Rover(1,1,"N");
        Rover rover_2 = new Rover(1,1,"S");
        Rover rover_3 = new Rover(1,0,"S");
        Rover rover_4 = new Rover(0,1,"S");

        assertNotEquals(rover_1, rover_2);
        assertNotEquals(rover_1, rover_3);
        assertNotEquals(rover_1, rover_4);
    }
}
