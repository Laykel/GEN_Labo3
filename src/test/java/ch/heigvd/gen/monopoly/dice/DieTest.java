package ch.heigvd.gen.monopoly.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    private Die d;

    @BeforeEach
    void setUp() {
        d = new Die();
    }

    @Test
    void faceValueShouldBeZeroWithoutRoll() {
        assertEquals(0, d.getFaceValue());
    }

    @RepeatedTest(50)
    void faceValueShouldBeBetween1andUpperBound() {
        d.roll();
        assertTrue(d.getFaceValue() >= 1 && d.getFaceValue() <= d.getUpperBound());
    }
}
