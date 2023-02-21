

public class BadOgre extends Ogre {

	int kill;
	void revenge(Knight knight) {
		if (hungry)
			eat(knight);
	}
	void eat(Knight knight) {
		knight.energy = 0;
	}

}


