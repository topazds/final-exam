package exam;

import static org.junit.Assert.*;

import org.junit.Test;

import exam.Exam1;


public class Exam1Test {
	Exam1 exam1 = new Exam1();

	@Test
	public void input8() {
		long response = exam1.checkinput(8);
		assertEquals(8, response);
	}
	
	@Test
	public void input10() {
		long response = exam1.checkinput(10);
		assertEquals(9, response);
	}
	
	@Test
	public void input20() {
		long response = exam1.checkinput(20);
		assertEquals(19, response);
	}
	
	@Test
	public void input132() {
		long response = exam1.checkinput(132);
		assertEquals(129, response);
	}
	
	@Test
	public void input111111111111111110() {
		long response = exam1.checkinput(111111111111111110L);
		assertEquals(99999999999999999L, response);
	}
	
	@Test
	public void input989999999999999999() {
		long response = exam1.checkinput(989999999999999999L);
		assertEquals(99999999999999999L, response);
	}
	
	@Test
	public void input653161544328834085() {
		long response = exam1.checkinput(653161544328834085L);
		assertEquals(599999999999999999L, response);
	}

}
