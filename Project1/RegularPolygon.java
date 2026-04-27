/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class represents a regular polygon shape, where all sides and angles equal,
 * that extends the SolidPolygon class. It constructs the polygon by calculating the coordinates
 * of its vertices based on the specified center point, number of sides, and radius.
 * The vertices are computed using trigonometric functions, cosine and sine, to ensure that 
 * they are evenly spaced around the center, forming a symmetrical shape.
 */

package cmsc330_project1;

import java.awt.*;
import java.lang.Math;


class RegularPolygon extends SolidPolygon 
{

	// Constructor to create a RegularPolygon object with a specified color, center point, number of sides, and radius.
	public RegularPolygon(Color color, Point center, int sides, int radius) 
	{
		super(color, sides);
		int[] x_points = new int[sides];
		int[] y_points = new int[sides];
		
		double increment = (Math.PI * 2) / sides;
		double current = 0.0;
		
		for(int i = 0; i < sides; i++)
		{
			double cosA = Math.cos(current);
			double sinA = Math.sin(current);
			
			x_points[i] = (int) (center.x + (radius * cosA));
			y_points[i] = (int) (center.y + (radius * sinA));
			
			current += increment;
		}
		
		createPolygon(x_points, y_points);
	}
}
