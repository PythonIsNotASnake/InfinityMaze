package objects;

public class Armor {

	private int abwehrPunkte;
	private String name;

	public Armor() {
		this.randomizedName();
		this.randomizedAbwehrPunkte();
	}

	public Armor(int abwehrPunkte) {
		this.abwehrPunkte = abwehrPunkte;
		this.name = "Keine Ruestung";
	}

	public int getAbwehrPunkte() {
		return abwehrPunkte;
	}

	public void setAbwehrPunkte(int abwehrPunkte) {
		this.abwehrPunkte = abwehrPunkte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void randomizedName() {

		int random = (int) (Math.random() * 6 + 1);

		if (random == 1 || random == 6 || random == 3) {
			this.setName("Leichte Ruestung");
		} else if (random == 2 || random == 4) {
			this.setName("Schwere Ruestung");
		} else if (random == 5) {
			this.setName("Edle Ruestung");
		}
	}

	public void randomizedAbwehrPunkte() {

		int random = (int) (Math.random() * 2 + 1);

		if (this.getName() == "Schwere Ruestung") {
			random = random + 1;
		} else if (this.getName() == "Edle Ruestung") {
			random = random + 3;
		}

		this.setAbwehrPunkte(random);

	}

	public String toString() {
		return "Name der Ruestung: " + this.getName() + "\n" + "Abwehrpunkte: " + this.getAbwehrPunkte();
	}
}
