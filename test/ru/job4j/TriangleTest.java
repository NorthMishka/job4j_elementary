package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenAB2AC2BC2ExistTrue() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenAB2AC2BC5ExistFalse() {
        boolean result = Triangle.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }
}