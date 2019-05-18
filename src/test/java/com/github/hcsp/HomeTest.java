package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.github.hcsp.pet.Cat;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCat() {
        assertTrue(Home.newCat() instanceof Cat);
    }
}
