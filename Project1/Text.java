/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class represents a text element that can be drawn within a graphical scene.
 * It extends the Image class and provides functionality for rendering a text string
 * at a specified location and in a specified color.
 */

package cmsc330_project1;

import java.awt.*;

class Text extends Image 
{
	private Color color;
	private Point vertex;
	private String text;
	
	// Constructor to create a Text object with the specified color, position, and text.
	public Text(Color color, Point vertex, String text)
	{
		super(color);
		this.color = color;
		this.vertex = vertex;
		this.text = text;
	}
	
	// Draws the text on the provided Graphic object at specified position with a specified color.
	@Override
	public void draw(Graphics graphics)
	{
		graphics.setColor(color);
		graphics.drawString(text, vertex.x, vertex.y);
	}
}
