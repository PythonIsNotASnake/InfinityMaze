package hauptpaket;

import java.util.Scanner;

import characters.Enemy;
import characters.Hero;
import characters.Oger;
import characters.Troll;
import characters.Zwerg;
import objects.Armor;
import objects.Arrow;
import objects.Axe;
import objects.Keule;
import objects.Spear;
import objects.Sword;
import objects.Weapon;

public class Path {

	private int random;
	private Hero held;

	public Path(int random, Hero held) {
		this.held = held;
		this.random = random;

		if (random >= 5) {
			// Enemy appear
			this.fight(this.enemyDrop());
			System.out.println("");
		} else if (random > 3 && random < 5) {
			// Item-Drop
			System.out.println("Eine Truhe wurde gefunden");
			this.itemDrop(held);
			System.out.println("");
		} else if (random == 3) {
			// Normaler Weg
			System.out.println("Sie befinden sich an einer Gabelung.");
			System.out.println("");
		} else if (random == 2) {
			// Normaler Weg
			System.out.println("Sie sind an einem kleinen Fluss, den Sie leicht ueberqueren koennen.");
			System.out.println("");
		} else if (random == 1) {
			// Normaler Weg
			System.out.println("Sie kommen immer tiefer in den Irrgarten und verlieren allmaehlich die Orientierung.");
			System.out.println("");
		}
	}

	public Enemy enemyDrop() {

		int random = (int) (Math.random() * 4 + 1);

		if (random == 3) {
			Enemy troll = new Troll();
			return troll;
		} else if (random == 4) {
			Enemy oger = new Oger();
			return oger;
		}

		Enemy zwerg = new Zwerg();
		return zwerg;
	}

	public void fight(Enemy enemy) {
		Scanner scan = new Scanner(System.in);
		System.out.println(enemy + " erscheint");
		System.out.println("Moechten Sie kaempfen, druecken Sie die 1");
		System.out.println("Moechten Sie fliehen, druecken Sie die 2");
		int auswahl = scan.nextInt();

		if (auswahl == 2) {
			auswahl = (int) (Math.random() * 2 + 1);
			if (auswahl == 1) {
				System.out.println("Ihre Flucht ist gescheitert!");
			}
		}

		switch (auswahl) {
		case 1:
			System.out.println("Der Kampf beginnt!\n");

			while (this.getHeld().getLifePoints() != 0 && this.getHeld().getLifePoints() > 0
					&& enemy.getLifePoints() != 0 && enemy.getLifePoints() > 0) {

				enemy.setLifePoints(enemy.getLifePoints() - this.getHeld().getWaffe().getDamage());

				int enemyDamage = enemy.getAttackPoints() - this.getHeld().getArmor().getAbwehrPunkte();
				if (enemyDamage < 0) {
					enemyDamage = 0;
				}
				this.getHeld().setLifePoints(this.getHeld().getLifePoints() - enemyDamage);
				try {
					Thread.sleep(1000);

					System.out.println("Sie haben Ihrem Gegner " + this.getHeld().getWaffe().getDamage()
							+ " Schadenspunkte zugefügt");
					System.out.println("Der Gegner hat Ihnen " + enemyDamage + " Schadenspunkte zugefügt\n");
					if (enemy.getLifePoints() < 0) {
						System.out.println("Der Gegner hat noch 0 Lebenspunkte");
					} else {
						System.out.println("Der Gegner hat noch " + enemy.getLifePoints() + " Lebenspunkte");
					}
					if (this.getHeld().getLifePoints() > 0) {
						System.out.println("Sie haben noch " + this.getHeld().getLifePoints() + " Lebenspunkte\n");
					}

					System.out.println("");

					Thread.sleep(1000);

				} catch (InterruptedException e) {
					// TODO Automatisch generierter Erfassungsblock
					e.printStackTrace();
				}

			}

			if (enemy.getLifePoints() <= 0 && this.getHeld().getLifePoints() <= 0) {
				System.out.println("Sie haben Ihren Gegner bezwungen");
				System.out.println("Ihr Held ist gefallen");
			} else if (enemy.getLifePoints() <= 0) {
				this.getHeld().setDefeatedEnemies();

				System.out.println("Sie haben Ihren Gegner bezwungen");
				System.out.println("Der Kampf wurde beendet");

			} else if (this.getHeld().getLifePoints() <= 0) {

				System.out.println("Ihr Held ist gefallen");
			}

			break;
		case 2:
			System.out.println("Sie sind geflohen");
			break;
		}

	}

	public void itemDrop(Hero held) {
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 12 + 1);

		if (random == 4 || random == 7) {
			Weapon axt = new Axe();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + axt + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getWaffe() + "\n");
			System.out
					.println("Moechten Sie die neue Waffe ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setWaffe(axt);
				System.out.println("Waffe erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Waffe behalten");
				break;
			}

		} else if (random == 6 || random == 8) {
			Weapon bogen = new Arrow();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + bogen + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getWaffe() + "\n");
			System.out
					.println("Moechten Sie die neue Waffe ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setWaffe(bogen);
				System.out.println("Waffe erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Waffe behalten");
				break;
			}

		} else if (random == 3 || random == 9) {
			Weapon keule = new Keule();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + keule + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getWaffe() + "\n");
			System.out
					.println("Moechten Sie die neue Waffe ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setWaffe(keule);
				System.out.println("Waffe erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Waffe behalten");
				break;
			}

		} else if (random == 2 || random == 11) {
			Weapon speer = new Spear();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + speer + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getWaffe() + "\n");
			System.out
					.println("Moechten Sie die neue Waffe ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setWaffe(speer);
				System.out.println("Waffe erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Waffe behalten");
				break;
			}

		} else if (random == 5) {
			Weapon schwert = new Sword();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + schwert + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getWaffe() + "\n");
			System.out
					.println("Moechten Sie die neue Waffe ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setWaffe(schwert);
				System.out.println("Waffe erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Waffe behalten");
				break;
			}

		} else if (random == 1 || random == 10 || random == 12) {
			Armor armor = new Armor();

			System.out.println("Ein Item wurde gedroppt: " + "\n\n" + armor + "\n");
			System.out.println("Aktuell ausgeruestet:\n" + this.getHeld().getArmor() + "\n");
			System.out
					.println("Moechten Sie die neue Armor ausruesten, druecken Sie die 1 ansonsten druecken Sie die 2");
			int auswahl = scan.nextInt();
			switch (auswahl) {
			case 1:
				this.getHeld().setArmor(armor);
				System.out.println("Armor erfolgreich gewechselt");
				break;
			case 2:
				System.out.println("Vorherige Armor behalten");
				break;
			}

		}
	}

	public Hero getHeld() {
		return this.held;
	}
}
