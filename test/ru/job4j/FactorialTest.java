package ru.job4j;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalc5Then120() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void whenCalc6Then720() {
        int rsl = Factorial.calc(6);
        assertThat(rsl, is(720));
    }

    @Test
    public void whenCalc0Then1() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
    }

    @Test
    public void whenCalc1Then1() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
    }
}