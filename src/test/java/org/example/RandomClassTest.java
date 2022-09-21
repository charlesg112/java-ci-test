package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomClassTest {
    @Test
    public void shouldReturn3() {
        RandomClass random = new RandomClass();

        assertEquals(random.GetNumber(), 4);
    }
}