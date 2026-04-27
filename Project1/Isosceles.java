/*
 * Student Name: Griffin Shay
 * Date: 11/11/2025
 * Project: Project 1
 * 
 * This class represents an isosceles triangle shape that extends the SolidPolygon class.
 * It constructs the triangle based on a specified top vertex (Point), height, width,
 * and color. The top vertex defines the apex of the triangle, and the base is calculated
 * symmetrically below it using the given width and height.
 */

package cmsc330_project1;

import java.awt.*;


class Isosceles extends SolidPolygon 
{

	// Constructor a Isosceles object with a specified color, top vertex, height, and width.
	public Isosceles(Color color, Point topVertex, int height, int width) 
	{
		super(color, 3);
		int[] x_points = {topVertex.x, topVertex.x - (width / 2), topVertex.x + (width / 2)};
		int[] y_points = {topVertex.y, topVertex.y + height, topVertex.y + height};
		createPolygon(x_points, y_points);
	}
}
