package hauptpaket;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub

		System.out.println("      (");
		System.out.println("       \\");
		System.out.println("        )" + "	-----------------");
		System.out.println("##-------->" + "	| Infinity Maze |");
		System.out.println("        )" + "	-----------------");
		System.out.println("       /");
		System.out.println("      (");
		System.out.println("");

		int zaehler = 0;
		while (zaehler != 2) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Druecken Sie die 1 um ein neues Spiel zu starten");
			System.out.println("Druecken Sie die 2 um Infinity Maze zu beenden");

			try {
				zaehler = scan.nextInt();

				switch (zaehler) {
				case 1:
					System.out.println("Waehlen Sie einen Schwierigkeitsgrad:");
					System.out.println("Druecken Sie die 1 fuer leicht");
					System.out.println("Druecken Sie die 2 fuer mittel");
					System.out.println("Druecken Sie die 3 fuer schwer");

					Scanner sc = new Scanner(System.in);

					int level = sc.nextInt();

					if (level >= 1 && level <= 3) {
						Game spiel = new Game(level);
						spiel.choosePath();
					} else {
						System.out.println("Ungueltige Eingabe\n");
					}

					break;
				case 2:
					System.out.println("Danke, dass Sie Infinity Maze gespielt haben");
					break;
				default:
					System.out.println("Ungueltige Eingabe\n");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Ungueltige Eingabe\n");
			}
		}
	}

}
