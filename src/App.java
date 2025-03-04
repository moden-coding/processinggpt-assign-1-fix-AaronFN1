import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(1350, 800);
    }

    public void setup() {
        background(248, 255, 248);

        //The line
        stroke(255, 0, 255);
        strokeWeight(9);
        line(400, 300, 1200, 700);

        //The circle
        fill (0, 0, 255);
        stroke(255, 50, 50);
        strokeWeight(4);
        ellipse(400, 300, 100, 100);

        //The rectangle
        fill (0, 255, 0);
        stroke (70, 70, 60);
        strokeWeight(8);
        rect(1200, 700, 90, 20);
    }
}
