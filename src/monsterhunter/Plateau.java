package monsterhunter;

import java.util.Arrays;

/**
 * <b>Classe Plateau</b>
 * <p>
 * Classe qui définit le plateau de jeu de la partie
 * </p>
 *
 */
public class Plateau {

	/**
	 * Constante définissant la taille du plateau, non modifiable au cours d'une
	 * partie.
	 */
	private final int TAILLE;

	/**
	 * la classe Plateau est constitué d'un tableau de case
	 * 
	 * @see Case
	 */
	private Case[][] plateau;

	/**
	 * un CompteTours est nécessaire.
	 * 
	 * @see CompteTours
	 */
	private CompteTours tours;

	/**
	 * Constructeur du Plateau initialise la taille, avec la valeur passée en
	 * paramètre, du plateau de jeu et créer un compteTours
	 * 
	 * @param taille valeur entière définissant la taille du plateau
	 */
	public Plateau(int taille) {
		this.TAILLE = taille;
		tours = new CompteTours(this);
	}

	/**
	 * Méthode servant à la création du plateau par le biais de la création d'un
	 * tableau de case
	 * 
	 * @return une tableau de Case
	 * @see Case
	 */
	public Case[][] creerPlateau() {
		plateau = new Case[TAILLE][TAILLE];
		for (int x = 0; x < plateau.length; x++) {
			for (int y = 0; y < plateau.length; y++) {
				plateau[x][y] = Case.CASENONDECOUVERTE;
			}
		}
		return plateau;
	}

	/**
	 * Méthode permettant de savoir si il est possible d'avancer ou non (si on
	 * arrive sur une borure du plateau)
	 * 
	 * @param x valeur du déplacement selon l'axe x
	 * @param y valeur du déplacement selon l'axe y
	 * @return TRUE si on peut avancer FALSE sinon
	 */
	public boolean peutAvancer(int x, int y) {
		if (x < 0 || y < 0 || x >= this.TAILLE || y >= this.TAILLE || plateau[x][y] == Case.CASEPASSE)
			return false;
		return true;
	}

	/**
	 * Mise à jour du statut de la case vers Case.JOUEUR
	 * 
	 * @param pos la position à mettre à jour
	 * @see Position
	 */
	public void avancer(Position pos) {
		plateau[pos.getX()][pos.getY()] = Case.JOUEUR;
	}

	/**
	 * Mise à jour du statut de la case vers Case.CASEPASSEE
	 * 
	 * @param pos la position à mettre à jour
	 * @see Position
	 */
	public void caseParcourue(Position pos) {
		plateau[pos.getX()][pos.getY()] = Case.CASEPASSE;
	}

	/**
	 * retourne la plateau, c'est-à-dire le tableau de Case, de l'objet courant
	 * 
	 * @see Case
	 * @return Case[][] this.plateau
	 */
	public Case[][] getPlateau() {
		return this.plateau;
	}

	/**
	 * retourne la taille du Plateau de la partie en cours
	 * 
	 * @return int this.TAILLE
	 */
	public int getTaille() {
		return this.TAILLE;
	}

	/**
	 * retourne le compteTours, c'est-à-dire, l'était du compteur de chaque case du
	 * plateau pour l'objet courant.
	 * 
	 * @see CompteTours
	 * @return CompteTours this.tours
	 */
	public CompteTours getCompteTours() {
		return this.tours;
	}

	/**
	 * méthode générant l'afficahe du plateau, ensuite l'affichage est mis sur la
	 * sortie.
	 */
	public void afficher() {
		for (int i = 0; i < this.plateau.length; i++) {
			System.out.println();
			System.out.print(Arrays.deepToString(plateau[i]));
		}
		System.out.println("\n\n");
	}

	/**
	 * méthode affichant le nom qui lui est passé en paramètre
	 * 
	 * @param str une chaîne de caractère
	 */
	public void afficherGagnant(String str) {
		System.out.println("\n\nVous avez " + str);
	}
}