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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.DARK_GRAY);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      
      //call other methods
      upperBody(window);
      
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.BLACK);
      window.fillOval(350, 120, 20, 20);
      window.fillOval(450, 120, 20, 20);
      window.fillOval(390, 150, 10, 10);

      window.setColor(Color.BLUE);
      window.drawArc(300, 80, 200, 100, 240, 60);

				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.RED);
       window.fillRect(325, 250, 150, 100);
       
       window.setColor(Color.BLACK);
       window.drawLine(325, 250, 250, 325);
       window.drawLine(475, 250, 550, 325);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.WHITE);
       window.fillRect(325, 400, 150, 100);
       
       window.setColor(Color.BLACK);
       window.drawLine(325, 500, 250, 575);
       window.drawLine(475, 500, 550, 575);
   }
}