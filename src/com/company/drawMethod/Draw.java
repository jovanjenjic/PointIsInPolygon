package com.company.drawMethod;

import javax.swing.*;
import java.awt.*;

public class Draw extends JApplet {

    private int[] x;
    private int[] y;
    private int numOfPoints;
    private int pointX;
    private int pointY;
    private boolean belong;

    public void setX(int[] x) {
        this.x = x;
    }
    public void setY(int[] y) {
        this.y = y;
    }
    public void setNumOfPoints(int numOfPoints) {
        this.numOfPoints = numOfPoints;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }
    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public void setBelong(boolean b) {
        this.belong = b;
    }

    public void paint(Graphics g)
    {
        // create a polygon with given x, y coordinates
        Polygon p = new Polygon(x, y, numOfPoints);

        // set the color of line drawn to blue
        g.setColor(Color.blue);

        // draw the polygon using drawPolygon
        // function using object of polygon class
        g.drawPolygon(p);
        g.drawOval(pointX - 7, pointY - 7, 14, 14);

        g.setColor(Color.red);
        if (belong) g.setColor(Color.green);
        g.fillOval(pointX - 2, pointY - 2, 4, 4);

    }
}