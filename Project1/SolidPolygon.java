/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class represents a solid polygon shape and extends the Polygon_ superclass.
 * It provides functionality for drawing both the outline and the filled interior of a polygon
 * using a specified color. The class serves as a base for specific solid shape classes such as
 * Isosceles, Parallelogram, and RegularPolygon.
 */

package cmsc330_project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


class SolidPolygon extends Polygon_ 
{

	// Constructor that creates a SolidPolygon object with a specified color and vertex count.
	public SolidPolygon(Color color, int vertexCount) 
	{
		super(color, vertexCount);
	}

	// Draws a filled polygon using the provided Graphics object.
	@Override
	public void drawPolygon(Graphics graphics, Polygon polygon) 
	{
		graphics.drawPolygon(polygon);
		graphics.fillPolygon(polygon);
	}
}
