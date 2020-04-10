package monsterhunter;

/**
 * <b>Classe Position</b>
 * <p>
 * Classe définissant les paramètres et les comportement de la position de
 * chaque entité
 * </p>
 * 
 * @see Entites
 *
 */
public class Position {
	/**
	 * valeur entière définissant la position selon l'axe x
	 */
	private int x;
	/**
	 * valeur entière définissant la position selon l'axey
	 */
	private int y;

	/**
	 * Constructeur de Position
	 * 
	 * @param x valeur entière de la position sur le plateau de l'entité selon l'axe
	 *          x
	 * @param y valeur entière de la position sur le plateau de l'entité selon l'axe
	 *          y
	 */
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * méthode retournant la position x de l'objet courant
	 * 
	 * @return int this.x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * méthode retournant la position y de l'objet courant
	 * 
	 * @return int this.y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * méthode retournant la position (le couple (x, y)) de l'objet courant
	 * 
	 * @return int[] position
	 */
	public int[] getPosition() {
		int[] position = new int[] { getX(), getY() };
		return position;
	}

	/**
	 * mise à jour de la valeur de x
	 * 
	 * @param x nouvelle valeur de x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * mise à jour de la valeur de y
	 * 
	 * @param y nouvelle valeur de y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * mise à jour de la valeur du couple (x, y)
	 * 
	 * @param x nouvelle valeur de x
	 * @param y nouvelle valeur de y
	 */
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
}