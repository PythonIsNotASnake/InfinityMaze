/**
 * @author Bernd Mampe
 * 
 * Abstrakte Klasse zum definieren eines Gegners
 */
package characters;

public abstract class Enemy {

	private int lifePoints;
	private int attackPoints;

	/**
	 * Gibt Lebenspunkte des Gegners zurueck
	 * 
	 * @return Lebenspunkte des Gegners als int
	 */
	public int getLifePoints() {
		return lifePoints;
	}

	/**
	 * Setzt neuen Wert fuer Lebenspunkte
	 * 
	 * @param lifePoints
	 *            setzt neuen Wert fuer Lebenspunkte
	 */
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	/**
	 * Gibt Angriffspunkte des Gegners zurueck
	 * 
	 * @return Angriffspunkte des Gegners als int
	 */
	public int getAttackPoints() {
		return attackPoints;
	}

	/**
	 * Setzt neuen Wert fuer Angriffspunkte
	 * 
	 * @param attackPoints
	 *            setzt neuen Wert fuer Angriffspunkte
	 */
	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	/**
	 * generiert zufaellige Lebenspunkte und setzt sie
	 */
	public abstract void randomizedLifePoints();

	/**
	 * generiert zufaellige Angriffspunkte und setzt sie
	 */
	public abstract void randomizedAttackPoints();

}
