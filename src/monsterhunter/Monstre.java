package monsterhunter;

/**
 * <b>Classe Monstre</b>
 * <p>
 * Un monstre est une extension de la classe entitée, il possède en plus une
 * position
 * </p>
 *
 * @see Entites
 */

public class Monstre extends Entites {

	/**
	 * la position est définie par un couple de coordonnées entières x et y.
	 */
	private int[] position;

	/**
	 * Contructeur du Monstre
	 * 
	 * @param pseudo
	 * @see Entites#pseudo
	 * 
	 * @param score
	 * @see Entites#score
	 * 
	 * @param position tableau d'entier à deux dimensions (x et y)
	 * @see Monstre#getPosition()
	 */
	public Monstre(String pseudo, int score, int[] position) {
		super(pseudo, score);
		// this.position = new int[] {(int)(Math.random()*20), (int)(Math.random()*20)};
		this.position = position;
	}

	/**
	 * retourne la position du monstre courant
	 * 
	 * @return int[] this.position
	 */
	public int[] getPosition() {
		return this.position;
	}

	/**
	 * permet la mise à jour de la position
	 * 
	 * @param x valeur entière représentant la valeur du déplacement en x
	 * 
	 * @param y valeur entière représentant la valeur du déplacement en y
	 */
	public void setPosition(int x, int y) {
		this.position[0] += x;
		this.position[1] += y;
	}
}