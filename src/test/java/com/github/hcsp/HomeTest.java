package com.github.hcsp;

import com.github.hcsp.pet.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCat() throws Exception {
        Method method = Home.class.getDeclaredMethod("newCat");
        method.setAccessible(true);
        Assertions.assertTrue(method.invoke(null) instanceof Cat);
    }
}
