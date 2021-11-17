package com.example.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void max() {
        Main activity = new Main();
        int [] mass = {1,25,4};
        int res = activity.Max(mass);
        int actual = 25;
        assertEquals(actual,res);
    }
    @Test
    public void max1() {
        Main activity = new Main();
        int [] mass = {0,0,0};
        int res = activity.Max(mass);
        int actual = 0;
        assertEquals(actual,res);
    }
    @Test
    public void max2() {
        Main activity = new Main();
        int [] mass = {-1,-6,-9};
        int res = activity.Max(mass);
        int actual = 0;
        assertEquals(actual,res);
    }
    @Test
    public void max3() {
        Main activity = new Main();
        int [] mass = {1,25,46};
        int res = activity.Max(mass);
        int actual = 46;
        assertEquals(actual,res);
    }
    @Test
    public void min() {
        Main activity = new Main();
        int [] mass = {1,25,4};
        int res = activity.Min(mass);
        int actual = 1;
        assertEquals(actual,res);
    }
    @Test
    public void min1() {
        Main activity = new Main();
        int [] mass = {-10,-6,-4};
        int res = activity.Min(mass);
        int actual = -10;
        assertEquals(actual,res);
    }
    @Test
    public void min2() {
        Main activity = new Main();
        int [] mass = {0,0,0};
        int res = activity.Min(mass);
        int actual = 0;
        assertEquals(actual,res);
    }
    @Test
    public void min3() {
        Main activity = new Main();
        int [] mass = {-1,25,4};
        int res = activity.Min(mass);
        int actual = -1;
        assertEquals(actual,res);
    }
}