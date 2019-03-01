package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
       xPos = x;
       yPos = y;
       width = wid;
       height = ht;
       color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillOval(xPos, yPos, width, height);
      window.fillRect(xPos+width/4, yPos-height/2, width/2, height);
      window.fillRect(xPos+width/4, yPos+height/2, width/2, height);
      window.fillRect(xPos+width/2, yPos+height/4, width, height/2);
      window.fillRect(xPos-width/2, yPos+height/4, width, height/2);
      window.drawOval(xPos-width, yPos-height, 3*width, 3*height);
      
      window.setColor(Color.BLACK);
      window.fillArc(xPos, yPos, width, height, 0, 45);
      window.fillArc(xPos, yPos, width, height, 90, 45);
      window.fillArc(xPos, yPos, width, height, 180, 45);
      window.fillArc(xPos, yPos, width, height, 270, 45);

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}