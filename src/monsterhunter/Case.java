package monsterhunter;

/**
 * <b> L'énum Case liste tous les types de case rencontrés sur le plateau </b>
 * <p> l'énum liste les possibilités suivantes :
 * <ul><li>CASE : case vide</li>
 * <li>JOUEUR : la case où se trouve le jour</li>
 * <li>CASEPASSE : les cases où le monstre est déjà passé</li>
 * <li>CASENONDECOUVERTE : les cases que le chasseur n'a pas encore explorées</li>
 * <li>CASEOBSTACLE : les cases où l'on trouve des obstacles</li>
 * </ul>
 * 
 * @version 1.0
 * 
 *
 */

public enum Case {
	CASE("/___/"), JOUEUR("/X/"), CASEPASSE("/---/"), CASENONDECOUVERTE("/000/"), CASEOBSTACLE("/|||/");

	/**
	 * La chaîne de caractère n n'est pas modifiable. Elle correspond à l'affichage
	 * de case pour le mode texte.
	 * 
	 * @see Case#Case(String)
	 * 
	 * @see Case#toString()
	 */
	private String n = "";

	/**
	 * Constructeur de Case <p> A la construction de l'objet, la chaîne de caractère
	 * correspondant à l'affichege est associée au type de la case.
	 * 
	 * @param n affichage de la case.
	 */
	private Case(String n) {
		this.n = n;
	}

	/**
	 * Retourne l'affichage de la case
	 * 
	 * @return n
	 */
	public String toString() {
		return n;
	}
}