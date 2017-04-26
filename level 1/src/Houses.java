import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(20);
		Tortoise.setY(400);
		Tortoise.show();
		Tortoise.penDown();
		String textsize = JOptionPane.showInputDialog(
				"what size do you want your houses to be.Large medium or small(make the first letter capital)");
		String textcolor = JOptionPane
				.showInputDialog("What color do you want your houses to be? Red, Pink or Blue (first letter CAPITAL)");

		for (int j = 0; j < 10; j++) {
			drawHouse(textsize, 40, textcolor);
		}

	}

	public static void drawHouse(String textsize, int length, String textcolor) {
		int size = 0;
		if (textsize.equals("Small")) {
			size = 60;
		}
		if (textsize.equals("Medium")) {
			size = 120;
		}
		if (textsize.equals("Large")) {
			size = 250;
		}

		Color color = null;
		if (textcolor.equals("Red")) {
			color = Color.RED;

		}
		if (textcolor.equals("Pink")) {
			color = Color.PINK;

		}
		if (textcolor.equals("Blue")) {
			color = Color.BLUE;

		}
		Tortoise.setPenColor(color);
		Tortoise.move(size);
		// Tortoise.turn(90);
		// Tortoise.move(length);
		// Tortoise.turn(90);
		if (textsize.equals("Large")) {
			drawFlatRoof(length);
		} else {
			drawPointyRoof();
		}
		Tortoise.move(size);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.turn(-90);
		Tortoise.move(20);
		Tortoise.turn(-90);

	}

	public static void drawPointyRoof() {
		Tortoise.turn(30);
		Tortoise.move(30);
		Tortoise.turn(120);
		Tortoise.move(30);
		Tortoise.turn(30);
	}

	public static void drawFlatRoof(int length) {
		Tortoise.turn(90);
		Tortoise.move(length);
		Tortoise.turn(90);
	}
}

// 1. have the tortoise start in the bottom left corner
//
// 2. draw a house of height 100 with grass after it. This shape: |**|_
//
// 3. extract the piece of code that draws the house into a method. Draw 10
// houses.
//
// 4. Change the method to take int height as a parameter. Draw 9 houses of
// different heights
//
// 5. Make the method take a String instead of a height.
//
// “small” 60
// “medium” 120
// “large” 250
//
// 6. Make the method take a color as well as a height. The houses are drawn in
// that color.
//
// [optional] Set the scene to night time by setting the background to black
// using Tortoise.getBackgroundWindow().setColor
//
// 7. Give the houses peaked roofs
//
// 8. Extract that roof code into a method “drawPointyRoof” and create a new
// method: “drawFlatRoof”.
//
// 9. make large houses have flat rooves
