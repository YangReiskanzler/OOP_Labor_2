import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    ball ball = new ball(this,100,100,200,100,0);
    ball[] balls = new ball[100];

    @Override
    public void settings() {
        size(800, 800);
        Random rnd = new Random();
        for (int x = 0; x < balls.length; x++) {
            balls[x] = new ball(this);
        }
    }

    @Override
    public void draw() {
        background(100);
        for (int x = 0; x < balls.length; x++) {
            balls[x].male();
            balls[x].move(1 / frameRate);
        }
    }
}






