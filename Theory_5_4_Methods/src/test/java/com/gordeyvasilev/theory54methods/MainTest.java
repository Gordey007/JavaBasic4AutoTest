package com.gordeyvasilev.theory54methods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    public void testAdoptMethod() {
        Cat cat = new Cat();

        assertFalse(cat.isCollarStatus());

        Main.adopt(cat);

        assertTrue(cat.isCollarStatus());
    }
}