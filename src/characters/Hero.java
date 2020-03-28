/**
 * @author Bernd Mampe
 * 
 * Klasse zum erstellen des Helden
 */
package characters;

import objects.Armor;
import objects.Keule;
import objects.Weapon;

public class Hero {

	private int lifePoints;
	private Armor armor;
	private Weapon waffe;
	private int defeatedEnemies;

	/**
	 * Konstruktor fuer Helden
	 */
	public Hero() {
		this.defeatedEnemies = 0;
		this.lifePoints = 1;
		this.armor = new Armor(0);
		this.waffe = new Keule();

	}

	/**
	 * Gibt die Anzahl der besiegten Gegner zurück
	 * 
	 * @return die Anzahl der besiegten Gegner
	 */
	public int getDefeatedEnemies() {
		return this.defeatedEnemies;
	}

	/**
	 * Erhoeht die Anzahl der besiegten Gegner um 1
	 */
	public void setDefeatedEnemies() {
		this.defeatedEnemies = this.getDefeatedEnemies() + 1;
	}

	/**
	 * Gibt die Lebenspunkte des Helden zurueck
	 * 
	 * @return Lebenspunkte des Helden
	 */
	public int getLifePoints() {
		return this.lifePoints;
	}

	/**
	 * Aktualisiert die Lebenspunkte des Helden
	 * 
	 * @param lifePoints
	 *            Neue Lebenspunkte des Helden
	 */
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	/**
	 * Gibt die Armor des Helden zurueck
	 * 
	 * @return Armor des Helden
	 */
	public Armor getArmor() {
		return this.armor;
	}

	/**
	 * Setzt neue Armor fuer den Helden
	 * 
	 * @param armor
	 *            Neue Armor des Helden
	 */
	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	/**
	 * Gibt die Waffen des Helden zurueck
	 * 
	 * @return Waffe des Helden
	 */
	public Weapon getWaffe() {
		return this.waffe;
	}

	/**
	 * Setzt neue Waffe fuer den Helden
	 * 
	 * @param waffe
	 *            Neue Waffe des Helden
	 */
	public void setWaffe(Weapon waffe) {
		this.waffe = waffe;
	}

	/**
	 * Gibt benutzerdefinierten String des Helden zurueck
	 * 
	 * @return Benutzerdefinierter String
	 */
	public String toString() {
		return "Lebenspunkte: " + this.getLifePoints() + "\n" + this.getArmor() + "\n" + this.getWaffe();
	}
}
