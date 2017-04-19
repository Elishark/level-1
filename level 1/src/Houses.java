import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(20);
		Tortoise.setY(400);
		Tortoise.show();
		Tortoise.penDown();
		for (int j = 0; j < 10; j++) {
			drawHouse(300, 40);
		}
	}

	public static void drawHouse(int size, int length) {

		Tortoise.setPenColor(Color.BLACK);
		Tortoise.move(size);
		Tortoise.turn(90);
		Tortoise.move(length);
		Tortoise.turn(90);
		Tortoise.move(size);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.turn(-90);
		Tortoise.move(20);
		Tortoise.turn(-90);
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
