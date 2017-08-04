package exam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exam2Test {
	Exam2 exam2 = new Exam2();
	
	@Test
	public void testA1() {
		exam2.productASell();
		int result = exam2.processPrice();
		assertEquals(100, result);
	}
	
	@Test
	public void testA1B1() {
		exam2.productASell();
		exam2.productBSell();
		int result = exam2.processPrice();
		assertEquals(190, result);
	}
	
	@Test
	public void testA1B1C1() {
		exam2.productASell();
		exam2.productBSell();
		exam2.productCSell();
		int result = exam2.processPrice();
		assertEquals(270, result);
	}
	
	@Test
	public void testA1B1C1D1() {
		exam2.productASell();
		exam2.productBSell();
		exam2.productCSell();
		exam2.productDSell();
		int result = exam2.processPrice();
		assertEquals(320, result);
	}
	
	@Test
	public void testA1B1C1D1E1() {
		exam2.productASell();
		exam2.productBSell();
		exam2.productCSell();
		exam2.productDSell();
		exam2.productESell();
		int result = exam2.processPrice();
		assertEquals(425, result);
	}
	
	@Test
	public void testA2() {
		exam2.productASell();
		exam2.productASell();
		int result = exam2.processPrice();
		assertEquals(200, result);
	}
	
	@Test
	public void testA2() {
		exam2.productASell();
		exam2.productASell();
		int result = exam2.processPrice();
		assertEquals(200, result);
	}
	
}
