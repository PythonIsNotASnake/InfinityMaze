package characters;

public class Zwerg extends Enemy {

	public Zwerg() {
		this.randomizedLifePoints();
		this.randomizedAttackPoints();
	}

	@Override
	public void randomizedLifePoints() {
		// TODO Automatisch generierter Methodenstub
		int random = (int) (Math.random() * 5 + 1);
		random = random + 10;
		this.setLifePoints(random);
	}

	@Override
	public void randomizedAttackPoints() {
		// TODO Automatisch generierter Methodenstub
		int random = (int) (Math.random() * 3 + 1);
		random = random + 3;
		this.setAttackPoints(random);
	}

	public String toString() {
		return "Ein Zwerg mit " + this.getLifePoints() + " Lebenspunkten und " + this.getAttackPoints()
				+ " Angriffspunkten";
	}

}
