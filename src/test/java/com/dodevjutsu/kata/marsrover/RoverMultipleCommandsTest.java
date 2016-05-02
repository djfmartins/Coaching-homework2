package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverMultipleCommandsTest {

    @Test
    public void testMultipleCommands() {
        Rover rover = new Rover(0, 0, "N");

        rover.receive("rrrr");
        assertEquals(new Rover(0, 0, "N"), rover);

        rover.receive("ffrfrblbbl");
        assertEquals(new Rover(-1, 3, "N"), rover);

        rover.receive("bbrffrfbbl");
        assertEquals(new Rover(1, 2, "E"), rover);
    }
}