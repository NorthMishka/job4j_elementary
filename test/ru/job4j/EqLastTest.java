package ru.job4j;

import static ru.job4j.EqLast.check;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;


public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 3};
        assertThat(check(left, right), is(true));
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }

    @Test
    public void whenNotEq2() {
        int[] left = {1, 2, 5};
        int[] right = {3, 3, 4};
        assertThat(check(left, right), is(false));
    }

}