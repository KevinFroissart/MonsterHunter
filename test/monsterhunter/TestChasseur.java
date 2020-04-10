package monsterhunter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestChasseur {

	Chasseur c = new Chasseur("Franck", 10, new int[] { 3, 3 });

	@Test
	public void testGetPseudo() {
		assertEquals("Franck", c.getPseudo());
		assertNotEquals("Tyrion", c.getPseudo());
	}

	@Test
	public void testGetScore() {
		assertEquals(10, c.getScore());
		assertNotEquals(25, c.getScore());
	}

	@Test
	public void testGetPosition() {
		assertEquals(Arrays.toString(new int[] { 3, 3 }), Arrays.toString(c.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 5, 2 }), Arrays.toString(c.getPosition()));
	}

	@Test
	public void testSetPosition() {
		c.setPosition(1, 1);
		assertEquals(Arrays.toString(new int[] { 4, 4 }), Arrays.toString(c.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 1, 1 }), Arrays.toString(c.getPosition()));
	}
}