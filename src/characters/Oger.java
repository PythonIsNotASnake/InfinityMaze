/**
 * @author Bernd Mampe
 * 
 * Klasse zum Erstellen eines Ogers
 */
package characters;

public class Oger extends Enemy {

	/**
	 * leerer Konstruktor zum Erstellen eines Ogers
	 */
	public Oger() {
		this.randomizedLifePoints();
		this.randomizedAttackPoints();
	}

	@Override
	public void randomizedLifePoints() {
		// TODO Automatisch generierter Methodenstub
		int random = (int) (Math.random() * 5 + 1);
		random = random + 15;
		this.setLifePoints(random);
	}

	@Override
	public void randomizedAttackPoints() {
		// TODO Automatisch generierter Methodenstub
		int random = (int) (Math.random() * 3 + 1);
		random = random + 5;
		this.setAttackPoints(random);
	}

	public String toString() {
		return "Ein Oger mit " + this.getLifePoints() + " Lebenspunkten und " + this.getAttackPoints()
				+ " Angriffspunkten";
	}
}
