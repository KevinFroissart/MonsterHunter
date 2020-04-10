package monsterhunter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeplacement {
	int taille = 10;
	Position monstre = Deplacement.coordsInput(taille);
	Plateau plateau = new Plateau(taille);
	String dep = Deplacement.deplacement();

	@Test
	public void testcoordsInput() {
		// tapez une coordonnée dans le terminal de type 00 ou 01
		System.out.println(Deplacement.coordsInput(taille));
	}
}
