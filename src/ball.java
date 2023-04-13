import processing.core.PApplet;

import java.awt.*;
import java.util.Random;

public class ball {
    private Fenster window;
    private double xpos;
    private double ypos;
    private double diameter;
    private int color;
    private double v;
    private double g = 98.1;

    ball(Fenster iwindow, double ixpos, double iypos, double idiameter, int icolor, double iv) {
        window=iwindow;
        xpos=ixpos;
        ypos=iypos;
        diameter=idiameter;
        color=icolor;
        v=iv;
    }
    ball(String PAppletwindow) {
        Random rnd = new Random();
        float xpos = rnd.nextFloat(101,701);
        float ypos = rnd.nextFloat(101, 701);
        float diameter = rnd.nextFloat(101, 201);
        male(xpos, ypos, diameter);
    }

    void male(float xpos, float ypos, float diameter) {
        window.circle(xpos, ypos, diameter);
    }
    public void move(double t) {
        v=v+g*t;
        ypos=ypos+v*t;
        if(ypos >= window.height-50) {
            v = -v;
            ypos = ypos + v * t;
        }
    }
}
