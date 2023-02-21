
public class Ogre {

    boolean hungry;
	int energy;
	void revenge(Knight knight) {
		if (energy > knight.getEnergy())
			knight.setEnergy((int) (0.9 * knight.getEnergy()));
	}
}
