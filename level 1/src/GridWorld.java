import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Location location = new Location(6, 6);
		world.add(location, bug);
		Random random = new Random();
		Bug bug2 = new Bug();
		bug2.setColor(Color.blue);
		bug2.turn();
		bug2.turn();
		int x = random.nextInt(8);
		int y = random.nextInt(8);
		Flower flower2 = new Flower();
		Flower flower3 = new Flower();
		Location location4 = new Location(x, y - 1);
		world.add(location4, flower2);
		Location location5 = new Location(x, y + 1);
		world.add(location5, flower3);
		Location location2 = new Location(x, y);
		world.add(location2, bug2);
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				Flower flower = new Flower();

				Location location3 = new Location(j, i);
				world.add(location3, flower);

			}
		}
	}

}
