package com.sqli.test.cat;


import main.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CatTest {

    /**
     * Each time the cat leaps, the leap lenght is longer by one. But the leap lenght maximum is 4.
     * <p>
     * The path method displays the leaps done by the cat.
     */

    @Test

    public void test() {

        Cat cat = new Cat();

        assertEquals("*", cat.path());
        System.out.println(cat.path());

        cat.leap();
        System.out.println(cat.path());
        assertEquals("*.*", cat.path());

        cat.leap();
        System.out.println(cat.path());

        assertEquals("*.*..*", cat.path());

        cat.leap();
        System.out.println(cat.path());

        assertEquals("*.*..*...*", cat.path());

        cat.leap();
        System.out.println(cat.path());

        assertEquals("*.*..*...*....*", cat.path());

        cat.leap();
        System.out.println(cat.path());

        assertEquals("*.*..*...*....*....*", cat.path());
    }
}
