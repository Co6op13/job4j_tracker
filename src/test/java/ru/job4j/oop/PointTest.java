package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when000to200then2() {
        double expected = 2;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(2,0, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to002then2() {
        double expected = 2;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0,0, 2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to020then2() {
        double expected = 2;
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(0,2, 0);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1dot41() {
        double expected = 1.41;
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenM1M1to22then4do24() {
        double expected = 4.24;
        Point point1 = new Point(-1, -1);
        Point point2 = new Point(2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenM11toM22then1do41() {
        double expected = 1.41;
        Point point1 = new Point(-1, 1);
        Point point2 = new Point(-2, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1M1to2M2then1do41() {
        double expected = 1.41;
        Point point1 = new Point(1, -1);
        Point point2 = new Point(2, -2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1001to2002then1do41() {
        double expected = 100;
        Point point1 = new Point(100, 1);
        Point point2 = new Point(200, 2);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}