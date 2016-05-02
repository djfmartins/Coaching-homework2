package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverDisplacementTest {

    @Test
    public void testNorthDisplaceForward() {
        Rover rover = new Rover(0, 0, "N");
        rover.receive("f");

        assertEquals(new Rover(0, 1, "N"), rover);
    }

    @Test
    public void testNorthDisplaceBackwards() {
        Rover rover = new Rover(5, 5, "N");
        rover.receive("b");

        assertEquals(new Rover(5, 4, "N"), rover);
    }
}
