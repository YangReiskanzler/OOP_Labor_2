import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    private ball ball;

    @Override
    public void settings() {
        size(800, 800);
        ball = new ball(this,400,400,100,136, 0);
        ball = new ball("This");
    }

    @Override
    public void draw() {
        background(100);
        Random rnd = new Random();
        int rot = rnd.nextInt(1, 255);
        int gruen = rnd.nextInt(1, 255);
        int blau = rnd.nextInt(1,255);
        fill(rot, gruen, blau);
       ball.move(0.1);
    }


}


