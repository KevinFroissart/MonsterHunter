package monsterhunter;

import java.util.Arrays;

/**
 * <b>Classe CompteTours</b>
 * <p>
 * Le CompteTours permet de compter depuis combien de tour le monstre est passé
 * sur la case
 * </p>
 *
 */

public class CompteTours {

	/**
	 * Nombre de tour de jeu total
	 */
	private int nbToursTotal;
	/**
	 * Plateau du jeu sur lequel il faut compter les passages.
	 * 
	 * @see Plateau
	 */
	private Plateau plateau;
	/**
	 * Tableau dans lequel les nombres de passage sont sauvegardés.
	 */
	private int[][] tabCompteur;

	/**
	 * Constructeur de CompteTours
	 * 
	 * @param p Plateau de jeu de la partie
	 */
	public CompteTours(Plateau p) {
		this.nbToursTotal = 1;
		this.plateau = p;
		this.tabCompteur = new int[p.getTaille()][p.getTaille()];
		this.initTabCompteur();
	}

	/**
	 * Incrémente le nombre de tours de 1.
	 */
	public void incrToursTotal() {
		this.nbToursTotal += 1;
	}

	/**
	 * Retourne le nombre total de tours de l'objet courant.
	 * 
	 * @return int this.nbToursTotal
	 */
	public int getNbToursTotal() {
		return this.nbToursTotal;
	}

	/**
	 * fonction d'initialisation du compteur.
	 */
	private void initTabCompteur() {
		for (int i = 0; i < this.tabCompteur.length; i++) {
			for (int j = 0; j < tabCompteur[1].length; j++) {
				tabCompteur[i][j] = 0;
			}
		}
	}

	/**
	 * fonction d'incrémentation du compte tours
	 * 
	 * @param pos position à laquelle on souhaite ajouter un tour.
	 */
	public void incrCompteTours(Position pos) {
		for (int i = 0; i < this.tabCompteur.length; i++) {
			for (int j = 0; j < tabCompteur[1].length; j++) {
				if (this.tabCompteur[i][j] > 0) {
					this.tabCompteur[i][j] += 1;
				}
			}
		}
		this.tabCompteur[pos.getX()][pos.getY()] += 1;
	}

	/**
	 * retourne le nombre de tour depuis le dernier passage à une position passée en
	 * parmètre
	 * 
	 * @param pos position à laquelle on veut connaître le nombre de tour depuis le
	 *            dernier passage.
	 * @return int le nombre de tour depuis le dernier passage
	 */
	public int getTours(Position pos) {
		return this.tabCompteur[pos.getX()][pos.getY()];
	}

	/**
	 * retourne les informations de la classe sous une chaîne de caractères
	 */
	@Override
	public String toString() {
		return Arrays.toString(tabCompteur);
	}

	/**
	 * retourne le tableau avec les compteurs de toutes les positons de l'objet
	 * courant.
	 * 
	 * @return int[][] this.tabCompteur
	 */
	public int[][] getTab() {
		return this.tabCompteur;
	}
}