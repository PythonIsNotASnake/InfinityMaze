package hauptpaket;

import java.util.Scanner;

import characters.Hero;

public class Game {

	private Hero held;

	public Game(int level) {

		this.held = new Hero();

		if (level == 1) {
			this.held.setLifePoints(100);
		} else if (level == 2) {
			this.held.setLifePoints(75);
		} else if (level == 3) {
			this.held.setLifePoints(50);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(this.getHeld());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");
	}

	public void choosePath() {
		int path = 0;
		int choice = 0;
		Path weg;
		while (path != 5) {

			if (this.getHeld().getLifePoints() <= 0) {
				System.out.println(this.getHeld());
				System.out.println("\n Sie haben " + this.getHeld().getDefeatedEnemies() + " Gegner besiegt\n");
				System.out.println("		-------------");
				System.out.println("		| Game Over |");
				System.out.println("		-------------");

				break;
			}

			Scanner scan = new Scanner(System.in);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Druecken Sie die 1 um nach links zu gehen");
			System.out.println("Druecken Sie die 2 um geradeaus zu gehen");
			System.out.println("Druecken Sie die 3 um nach rechts zu gehen");
			System.out.println("Druecken Sie die 4 um deine Stats zu sehen");
			System.out.println("Druecken Sie die 5 um das aktuelle Spiel zu beenden");
			try {
				path = scan.nextInt();

				switch (path) {
				case 1:
					choice = (int) (Math.random() * 5 + 1);
					weg = new Path(choice, held);
					break;
				case 2:
					choice = (int) (Math.random() * 5 + 1);
					weg = new Path(choice, held);
					break;
				case 3:
					choice = (int) (Math.random() * 5 + 1);
					weg = new Path(choice, held);
					break;
				case 4:
					System.out.println(this.getHeld());
					break;
				case 5:
					System.out.println("");
					System.out.println("Ihre Stats:");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println(this.getHeld());
					System.out.println("Sie haben " + this.getHeld().getDefeatedEnemies() + " Gegner besiegt");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("");
					System.out.println("Bis zum naechsten Besuch im Irrgarten");

					break;
				default:
					System.out.println("Ungueltige Eingabe\n");
					break;
				}
			} catch (Exception e) {
				// TODO Automatisch generierter Erfassungsblock
				System.out.println("Ungueltige Eingabe\n");
			}
		}
	}

	public Hero getHeld() {
		return this.held;
	}

}
