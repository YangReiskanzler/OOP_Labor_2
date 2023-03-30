import processing.core.PApplet;

public class Fenster extends PApplet {
    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void draw() {
        background(150);
        ellipse(50,50,50,50);
    }

}

