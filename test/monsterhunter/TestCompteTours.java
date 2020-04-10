package monsterhunter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompteTours {

	Plateau plateau = new Plateau(10);
	CompteTours compte = new CompteTours(plateau);
	Position pos = new Position(0, 1);
	Position pos2 = new Position(1, 1);

	@Test
	public void testGetTours() {
		assertEquals(0, compte.getTours(pos));
		assertNotEquals(1, compte.getTours(pos));
	}

	@Test
	public void testIncrToursTotal() {
		compte.incrToursTotal();

		assertEquals(2, compte.getNbToursTotal());
		assertNotEquals(0, compte.getNbToursTotal());
	}

	@Test
	public void testIncrCompteTours() {
		compte.incrCompteTours(pos);
		compte.incrCompteTours(pos2);

		assertEquals(2, compte.getTours(pos));
		assertNotEquals(23, compte.getTours(pos));
		assertEquals(1, compte.getTours(pos2));
		assertNotEquals(12, compte.getTours(pos2));
	}

	@Test
	public void testGetNbToursTotal() {
		for (int i = 0; i < 15; i++)
			compte.incrToursTotal();
		assertEquals(16, compte.getNbToursTotal());
		assertNotEquals(2, compte.getNbToursTotal());
	}
}