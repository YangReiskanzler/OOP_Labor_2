import processing.core.PApplet;

public class Fenster extends PApplet {
    private ball ball;

    @Override
    public void settings() {
        size(800, 800);
        ball = new ball(this,400,400,100,200, 0);
        ball = new ball(this);
    }

    @Override
    public void draw() {
        background(100);
       ball.male();
       ball.move(0.1);
    }


}


