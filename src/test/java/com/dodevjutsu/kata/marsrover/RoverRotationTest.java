package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverRotationTest {

    @Test
    public void testNorthRotateLeft() {
        Rover rover = new Rover(0, 0, "N");
        rover.receive("l");

        assertEquals(new Rover(0, 0, "W"), rover);
    }

    @Test
    public void testNorthRotateRight() {
        Rover rover = new Rover(0, 0, "N");
        rover.receive("r");
        assertEquals(new Rover(0, 0, "E"), rover);
    }

    @Test
    public void testSouthRotateLeft() {
        Rover rover = new Rover(0, 0, "S");
        rover.receive("l");
        assertEquals(new Rover(0, 0, "E"), rover);
    }

    @Test
    public void testSouthRotateRight() {
        Rover rover = new Rover(0, 0, "S");
        rover.receive("r");
        assertEquals(new Rover(0, 0, "W"), rover);
    }

    @Test
    public void testWestRotateLeft() {
        Rover rover = new Rover(0, 0, "W");
        rover.receive("l");
        assertEquals(new Rover(0, 0, "N"), rover);
    }

    @Test
    public void testWestRotateRight() {
        Rover rover = new Rover(0, 0, "W");
        rover.receive("r");
        assertEquals(new Rover(0, 0, "S"), rover);
    }

    @Test
    public void testEastRotateLeft() {
        Rover rover = new Rover(0, 0, "E");
        rover.receive("l");
        assertEquals(new Rover(0, 0, "S"), rover);
    }

    @Test
    public void testEastRotateRight() {
        Rover rover = new Rover(0, 0, "E");
        rover.receive("r");
        assertEquals(new Rover(0, 0, "N"), rover);
    }
}
