package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//Red Rectangles
		StdDraw.setPenColor(200,0,0);
		StdDraw.filledRectangle(0.5, 0.6, 0.25,0.05 );
		StdDraw.filledRectangle(0.5, 0.4, 0.4,0.05 );
		StdDraw.filledRectangle(0.5, 0.1, 0.5,0.05 );
		
		//Blue Rectangles
		StdDraw.setPenColor(173,216,230);
		StdDraw.filledRectangle(0.5, 0.75, 0.15,0.05 );
		StdDraw.filledRectangle(0.5, 0.25, 0.4,0.05 );
		
		
		//Three circles
		StdDraw.setPenColor(150,0,0);
		StdDraw.filledCircle(0.5, 0.85, 0.02);
		StdDraw.filledCircle(0.4, 0.85, 0.02);
		StdDraw.filledCircle(0.6, 0.85, 0.02);
		
		//Four circles
		StdDraw.filledCircle(0.2, 0.5, 0.02);
		StdDraw.filledCircle(0.4, 0.5, 0.02);
		StdDraw.filledCircle(0.6, 0.5, 0.02);
		StdDraw.filledCircle(0.8, 0.5, 0.02);
		
		//California circle
		StdDraw.filledCircle(0.15, 0.85, 0.08);
		
		StdDraw.setPenColor(200,0,0);
		Font font= new Font("Arial", Font.BOLD,48);
		StdDraw.setFont(font);
		StdDraw.text(0.8, 0.8, "WE", -25);
		StdDraw.text(0.8, 0.7, "EETT", -25);
		
		
		
	}

}