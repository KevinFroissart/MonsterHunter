package monsterhunter;

/**
 * <b>Classe Entites</b>
 * <p>
 * Les entités sont les joueurs, ils peuvent être soit un chasseur, soit un
 * monstre et sont caractérisés par un pseudo et un score.
 * </p>
 * 
 * @see Chasseur
 * @see Monstre
 */

public abstract class Entites {

	/**
	 * Le pseudo n'est pas modifiable
	 */
	protected static String pseudo;
	/**
	 * le score n'est pas modifiable par le joueur
	 */
	protected static int score;

	/**
	 * Constructeur de l'entité
	 * 
	 * @param pseudo le pseudo n'est pas modifiable
	 * @see Entites#getPseudo()
	 * 
	 * @param score le score n'est pas modifié par le joueur
	 * @see Entites#getScore()
	 */
	public Entites(String pseudo, int score) {

		Entites.pseudo = pseudo;
		Entites.score = score;
	}

	/**
	 * Retourne le pseudo de l'entité
	 * 
	 * @return pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Retourne le score du joueur
	 * 
	 * @return score
	 */
	public int getScore() {
		return score;
	}

}
