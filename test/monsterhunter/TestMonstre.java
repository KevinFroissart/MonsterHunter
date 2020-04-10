package monsterhunter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestMonstre {

	Monstre m = new Monstre("La Montagne", 30, new int[] { 4, 5 });

	@Test
	public void testGetPseudo() {
		assertEquals("La Montagne", m.getPseudo());
		assertNotEquals("Tyrion", m.getPseudo());
	}

	@Test
	public void testGetScore() {
		assertEquals(30, m.getScore());
		assertNotEquals(25, m.getScore());
	}

	@Test
	public void testGetPosition() {
		assertEquals(Arrays.toString(new int[] { 4, 5 }), Arrays.toString(m.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 5, 2 }), Arrays.toString(m.getPosition()));
	}

	@Test
	public void testSetPosition() {
		m.setPosition(1, 1);
		assertEquals(Arrays.toString(new int[] { 5, 6 }), Arrays.toString(m.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 1, 1 }), Arrays.toString(m.getPosition()));
	}
}