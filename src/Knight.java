
public class Knight {
	private int energy;
	private int additional_energy;

	public Knight(){

	}

	public Knight(int energy){
		this.energy = energy;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	void attack(Ogre ogre) {
		ogre.energy = (int) (0.9 * ogre.energy); // (int) just casts a float result into an int

		ogre.revenge(this); // this represents a reference to the current knight object 
		System.out.println("Teraz utoci " + this );
	}
}
