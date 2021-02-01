package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println("result: " + out);
    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        double expected = 63;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.25);
        System.out.println("result: " + out);
    }
}