import processing.core.PApplet;

import java.util.Random;

public class Fenster extends PApplet {
    Random rnd = new Random();
    ball[] ball = new ball[rnd.nextInt(50)];

    @Override
    public void settings() {
        size(800, 800);
        Random rnd = new Random();
        for (int x = 0; x < ball.length; x++) {
            ball[x] = new ball("this");
        }
    }

    @Override
    public void draw() {
        background(100);
        Random rnd = new Random();
        int rot = rnd.nextInt(1, 255);
        int gruen = rnd.nextInt(1, 255);
        int blau = rnd.nextInt(1, 255);
        fill(rot, gruen, blau);
        ball[5].male(float xpos, float ypos, float diameter);
    }
}






