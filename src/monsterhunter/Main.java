package monsterhunter;

//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * <b>Classe Main</b>
 * <p>
 * Classe de simulation d'une partie
 * </p>
 *
 */

public class Main {

	//////////////////////////
	// //
	// 7 8 9 //
	// 4 6 //
	// 1 2 3 //
	// //
	//////////////////////////

	private static int taillePlateau = 5;
	private static Plateau monstre = new Plateau(taillePlateau);
	private static Plateau chasseur = new Plateau(taillePlateau);

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Tour " + monstre.getCompteTours().getNbToursTotal() + ", au monstre de jouer\n");
		System.out.println("Veuillez choisir une case de depart --- ligne puis colonne compris entre 0 et "
				+ (taillePlateau - 1) + " ex: 24");

		chasseur.creerPlateau();
		monstre.creerPlateau();
		monstre.afficher();

		Position posMonstre = Deplacement.coordsInput(taillePlateau);
		boolean etatJeu = true;

		while (etatJeu) {
			posMonstre = new Position(posMonstre.getX(), posMonstre.getY());
			clearScreen();
			System.out.println("Tour " + monstre.getCompteTours().getNbToursTotal() + ", au monstre de jouer\n");
			monstre.avancer(posMonstre);
			monstre.getCompteTours().incrCompteTours(posMonstre);

			monstre.afficher();
			monstre.caseParcourue(posMonstre);

			String seDeplacer = Deplacement.deplacement();
			Deplacement.avancer(seDeplacer, posMonstre, monstre);

			if (monstre.getCompteTours().getNbToursTotal() == (taillePlateau * taillePlateau) - 1) { // si le monstre a
																										// traverser
																										// tout le
																										// plateau il
																										// gagne
				etatJeu = false;
				monstre.afficherGagnant("gagne");
			} else {
				// si on ne peux plus avancer on perd
				if (!monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY())
						&& !monstre.peutAvancer(posMonstre.getX(), posMonstre.getY() - 1)
						&& !monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY())
						&& !monstre.peutAvancer(posMonstre.getX(), posMonstre.getY() + 1)
						&& !monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY() - 1)
						&& !monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY() + 1)
						&& !monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY() - 1)
						&& !monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY() + 1)) {
					etatJeu = false;
					monstre.afficherGagnant("perdu");
				}
			}

			monstre.avancer(posMonstre);
			monstre.afficher();
			TimeUnit.SECONDS.sleep(2);

			if (etatJeu) {

				clearScreen();
				System.out.println("Tour " + monstre.getCompteTours().getNbToursTotal() + ", au chasseur de jouer");
				chasseur.afficher();
				System.out.println("Entrez les coordonnees de la case a decouvrir");
				Position coordsChasseur = Deplacement.coordsInput(taillePlateau);
				coordsChasseur = new Position(coordsChasseur.getX(), coordsChasseur.getY());

				if (coordsChasseur.getX() == posMonstre.getX() && coordsChasseur.getY() == posMonstre.getY()) {
					System.out.println("Reussite");
					monstre.afficher();
					etatJeu = false;
					chasseur.afficherGagnant("gagné avec le Chasseur, le monstre se trouvait en [" + posMonstre.getX()
							+ "," + posMonstre.getY() + "]");
				} else {

					if (monstre.getCompteTours().getTours(coordsChasseur) == 0)
						System.out.println("Le monstre n'est pas encore passé par ici");
					else {

						System.out.println("Le monstre est passé sur la case [" + coordsChasseur.getX() + ","
								+ coordsChasseur.getY() + "] il" + " y a "
								+ monstre.getCompteTours().getTours(coordsChasseur) + " tours");
						chasseur.afficher();
					}
				}
				TimeUnit.SECONDS.sleep(5);
			}
			monstre.getCompteTours().incrToursTotal();
		}
	}
}