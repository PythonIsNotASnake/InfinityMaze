package characters;

public class Troll extends Enemy {

	public Troll() {
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
		random = random + 7;
		this.setAttackPoints(random);
	}

	public String toString() {
		return "Ein Troll mit " + this.getLifePoints() + " Lebenspunkten und " + this.getAttackPoints()
				+ " Angriffspunkten";
	}

}
