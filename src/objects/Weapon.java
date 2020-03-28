/**
 * @author Bernd Mampe
 * 
 * Abstrakte Klasse zum definieren einer Waffe
 */
package objects;

public abstract class Weapon {

	private int damage;
	private String name;

	public int getDamage() {
		return this.damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void randomizedDamage();

	public abstract void randomizedName();
}
