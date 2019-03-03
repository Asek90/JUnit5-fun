package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.Tests;

class TestingTests {
	Tests t =new Tests();
	@Test
	void TestAdding() {
		int x=2;
		int y=2;
		assertEquals(4, t.adding(x, y));
	}
	@Test
	void TestCheckRangeIfTrue() {
		int RangeMin = 10;
		int RangeMax = 20;
		int number = 16;
		assertTrue(t.checkRange(RangeMin, RangeMax, number));
	}
	@Test
	@Disabled
	void TestCheckRangeIfFalse() {
		int RangeMin = 10;
		int RangeMax = 20;
		int number = 21;
		assertFalse(t.checkRange(RangeMin, RangeMax, number));
	}
	@Test
	void TestcomputeCircleArea() {
		assertEquals(314.1592653589793, t.computeCircleArea(10),"Should return right circle area");
	}

}
