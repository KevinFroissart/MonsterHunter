package monsterhunter;

import java.util.Scanner;

/**
 * <b>Classe abstraite Déplacement</b>
 * <p>
 * CLasse en charge de la gestion des déplacements
 * </p>
 * 
 *
 */
public abstract class Deplacement {

	/**
	 * La méthode vérifie que les coordonnées saisies sont bien dans le plateau dont
	 * la taille est passée en paramètre.
	 * 
	 * @param taillePlateau int taille du plateau de jeu
	 * @see Plateau
	 * @return le couple position de type Position
	 */
	public static Position coordsInput(int taillePlateau) { // x
		boolean coordsCorrect = false;
		Position coordsPosition = null;
		while (!coordsCorrect) {

			@SuppressWarnings("resource")
			Scanner coordsKeyBoard = new Scanner(System.in);
			String coords = coordsKeyBoard.nextLine();
			// on verifie que la saisie soit correcte et dans les limites du tableau
			if (coords.length() == 2) {
				int x = (int) coords.charAt(0) - '0';
				int y = (int) coords.charAt(1) - '0';
				if (x >= 0 && y >= 0 && x < taillePlateau && y < taillePlateau) {
					coordsPosition = new Position(x, y);
					coordsCorrect = true;
				} else {
					System.out.println("Saisie incorrecte");
				}
			} else {
				System.out.println("Saisie incorrecte");
			}
		}
		return coordsPosition;
	}

	/**
	 * la méthode réalise le déplacement de l'entité
	 * 
	 * @param deplacement
	 * @param posMonstre  position de l'entité
	 * @see Position
	 * @see Entites
	 * @param monstre Plateau sur lequel a lieu le déplacement
	 * @see Plateau
	 */
	public static void avancer(String deplacement, Position posMonstre, Plateau monstre) {
		switch (deplacement) {
		// si on peux avancer on avance
		case "1":
			if (monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY() - 1)) {
				posMonstre.setPosition(posMonstre.getX() + 1, posMonstre.getY() - 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // bas gauche
		case "2":
			if (monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY())) {
				posMonstre.setPosition(posMonstre.getX() + 1, posMonstre.getY());
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // bas
		case "3":
			if (monstre.peutAvancer(posMonstre.getX() + 1, posMonstre.getY() + 1)) {
				posMonstre.setPosition(posMonstre.getX() + 1, posMonstre.getY() + 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // bas droite
		case "4":
			if (monstre.peutAvancer(posMonstre.getX(), posMonstre.getY() - 1)) {
				posMonstre.setPosition(posMonstre.getX(), posMonstre.getY() - 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // gauche
		// case 5 = action (piege//...)
		case "6":
			if (monstre.peutAvancer(posMonstre.getX(), posMonstre.getY() + 1)) {
				posMonstre.setPosition(posMonstre.getX(), posMonstre.getY() + 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // droite
		case "7":
			if (monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY() - 1)) {
				posMonstre.setPosition(posMonstre.getX() - 1, posMonstre.getY() - 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // haut gauche
		case "8":
			if (monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY())) {
				posMonstre.setPosition(posMonstre.getX() - 1, posMonstre.getY());
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break; // haut
		case "9":
			if (monstre.peutAvancer(posMonstre.getX() - 1, posMonstre.getY() + 1)) {
				posMonstre.setPosition(posMonstre.getX() - 1, posMonstre.getY() + 1);
			} else {
				System.out.println("Saisie incorrecte");
				avancer(deplacement(), posMonstre, monstre);
			}
			break;
		}
	}

	/**
	 * 
	 * @return
	 */
	public static String deplacement() {
		boolean deplacementCorrect = false;
		String deplacementRetour = null;
		while (!deplacementCorrect) {

			@SuppressWarnings("resource")
			Scanner deplacementKeyBoard = new Scanner(System.in);
			String deplacement = deplacementKeyBoard.nextLine();
			// on verifie que la saisie soit correcte
			if (deplacement.length() == 1) {
				int x = (int) deplacement.charAt(0) - '0';
				if (x == 1 || x == 2 || x == 3 || x == 4 || x == 6 || x == 7 || x == 8 || x == 9) {
					deplacementCorrect = true;
					deplacementRetour = deplacement;
				} else {
					System.out.println("Saisie incorrecte");
				}
			} else {
				System.out.println("Saisie incorrecte");
			}
		}
		return deplacementRetour;
	}
}