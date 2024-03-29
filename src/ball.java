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
    private int rot;
    private int gruen;
    private int blau;

    ball(Fenster iwindow, double ixpos, double iypos, double idiameter, int icolor, double iv) {
        window=iwindow;
        xpos=ixpos;
        ypos=iypos;
        diameter=idiameter;
        color=icolor;
        v=iv;
    }
    ball(Fenster window) {
        this.window = window;
        Random rnd = new Random();
        xpos = rnd.nextFloat(101,701);
        ypos = rnd.nextFloat(101, 701);
        diameter = rnd.nextFloat(101, 201);
        rot = rnd.nextInt(1, 255);
        gruen = rnd.nextInt(1, 255);
        blau = rnd.nextInt(1, 255);

        }


    void male() {
        window.fill(rot,gruen,blau);
        window.circle((float)xpos, (float)ypos, (float) diameter);
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
