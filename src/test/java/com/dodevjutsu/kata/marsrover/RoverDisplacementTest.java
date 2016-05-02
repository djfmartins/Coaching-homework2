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

    @Test
    public void testSouthDisplaceForward() {
        Rover rover = new Rover(3, 2, "S");
        rover.receive("f");

        assertEquals(new Rover(3, 1, "S"), rover);
    }

    @Test
    public void testSouthDisplaceBackwards() {
        Rover rover = new Rover(3, 2, "S");
        rover.receive("b");

        assertEquals(new Rover(3, 3, "S"), rover);
    }

    @Test
    public void testWestDisplaceForward() {
        Rover rover = new Rover(6, 6, "W");
        rover.receive("f");

        assertEquals(new Rover(5, 6, "W"), rover);
    }

    @Test
    public void testWestDisplaceBackwards() {
        Rover rover = new Rover(6, 6, "W");
        rover.receive("b");

        assertEquals(new Rover(7, 6, "W"), rover);
    }
}
