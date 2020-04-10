package monsterhunter;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestPosition {

	Position pos = new Position(5, 9);

	@Test
	public void testGetX() {
		assertEquals(5, pos.getX());
		assertNotEquals(6, pos.getX());
	}

	@Test
	public void testGetY() {
		assertEquals(9, pos.getY());
		assertNotEquals(6, pos.getY());
	}

	@Test
	public void testGetPosition() {
		assertEquals(Arrays.toString(new int[] { 5, 9 }), Arrays.toString(pos.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 5, 2 }), Arrays.toString(pos.getPosition()));
	}

	@Test
	public void testSetX() {
		pos.setX(5);
		assertEquals(5, pos.getX());
		assertNotEquals(6, pos.getX());
	}

	@Test
	public void testSetY() {
		pos.setY(7);
		assertEquals(7, pos.getY());
		assertNotEquals(6, pos.getY());
	}

	@Test
	public void testSetPosition() {
		pos.setPosition(5, 6);
		assertEquals(Arrays.toString(new int[] { 5, 6 }), Arrays.toString(pos.getPosition()));
		assertNotEquals(Arrays.toString(new int[] { 5, 9 }), Arrays.toString(pos.getPosition()));
	}

	@Test
	public void testToString() {
		assertEquals("[x=5, y=9]", pos.toString());
		assertNotEquals("[x=4, y=1]", pos.toString());
	}
}
