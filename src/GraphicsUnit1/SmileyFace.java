package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas {

    public SmileyFace() //constructor - sets up the class
    {
        setSize(800, 600);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public void paint(Graphics window) {
        smileyFace(window);
    }

    public void smileyFace(Graphics window) {
        window.setColor(Color.BLUE);
        window.drawString("SMILEY FACE LAB ", 35, 35);

        window.setColor(Color.YELLOW);
        window.fillOval(210, 100, 400, 400);

        window.setColor(Color.BLACK);
        window.fillOval(265, 175, 100, 100);

        window.fillOval(465, 175, 100, 100);

        window.fillOval(400, 250, 30, 50);

        window.setColor(Color.WHITE);
        window.fillArc(320, 300, 200, 100, 200, 140);

    }
}
