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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
       bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.ORANGE);
      int[] xArray = {400, 150, 650};
      int[] yArray = {50, 200, 200};
      window.fillPolygon(xArray, yArray, 3);
      
      window.setColor(Color.WHITE);
      window.fillRect(350, 450, 100, 150);
      
      window.setColor(Color.YELLOW);
      window.fillRect(300, 250, 50, 50);
      window.fillRect(500, 250, 50, 50);
      
      window.setColor(Color.DARK_GRAY);
      window.fillRect(50, 400, 50, 200);
      window.fillRect(700, 400, 50, 200);
      
      window.setColor(Color.GREEN);
      window.fillOval(5, 275, 150, 150);
      window.fillOval(650, 275, 150, 150);
      
      window.setColor(Color.BLACK);
      window.fillRect(250, 550, 25, 50);
      
      window.setColor(Color.GRAY);
      int[] newXArray = {125, 150, 400, 375};
      int[] newYArray = {580, 600, 520, 500};
      window.fillPolygon(newXArray, newYArray, 4);
      
      window.setColor(Color.RED);
      window.drawString("See-Saw", 250, 500);
      

   }
}