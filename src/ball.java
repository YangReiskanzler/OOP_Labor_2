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
    /*ball(String PAppletwindow) {
        this.PAppletwindow =
        Random diameter = new Random();
        for (double d = 100; d < 200; d++)
            System.out.println(diameter.nextDouble(1));
    }*/

    void male() {
        window.circle((float) xpos,(float) ypos, (float) diameter);
    }
    public void move(double t) {
        System.out.println(v);
        v=v+g*t;
        ypos=ypos+v*t;
        if(ypos >= window.height-50) {
            v = -v;
            ypos = ypos + v * t;
        }
    }
}
