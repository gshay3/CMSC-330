/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class represents a parallelogram shape that extends the SolidPolygon class.
 * It constructs the polygon based on two diagonal corner points, upper left and
 * lower right, a horizontal offset to determine the slant of the sides, and a color.
 * The parallelogram is defined by four vertices whose coordinates are calculated
 * using the provided points and offset value.
 */

package cmsc330_project1;

import java.awt.*;


class Parallelogram extends SolidPolygon 
{

	// Constructor to create a Parallelogram object with a specified color, corner points, and horizontal offset. 
	public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) 
	{
		super(color, 4);
		int[] x_points = {upperLeft.x, lowerRight.x + offset, lowerRight.x, upperLeft.x - offset};
		int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
		createPolygon(x_points, y_points);
	}
}
