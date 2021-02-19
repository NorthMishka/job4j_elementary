package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1Plus2Then3() {
        int result = Max.max(1, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4Plus2Plus1Then7() {
        int result = Max.max(4, 2, 1);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax2Plus2Plus2Plus2Then8() {
        int result = Max.max(2, 2, 2, 2);
        assertThat(result, is(8));
    }
}