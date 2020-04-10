package monsterhunter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlateau {

	Plateau p = new Plateau(2);
	Position pos = new Position(0, 0);

	@Test
	public void testPeutAvancer() {
		p.creerPlateau();
		assertTrue(p.peutAvancer(0, 1));
		assertTrue(p.peutAvancer(1, 0));
		assertTrue(p.peutAvancer(1, 1));
		assertFalse(p.peutAvancer(-1, 0));
		assertFalse(p.peutAvancer(-1, -1));
		assertFalse(p.peutAvancer(0, -1));
	}

	@Test
	public void testGetTaille() {
		p.creerPlateau();
		assertEquals(2, p.getTaille());
		assertNotEquals(5, p.getTaille());
	}
}