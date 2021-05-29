package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import cts.seminar13.clase.Grupa;

public class TesteConstructorGrupa {

	@Test
	public void testRight() {
		Grupa grupa = new Grupa(1001);
		assertEquals(1001, grupa.getNrGrupa());
		
	}

	@Test
	public void testBoundryLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testBoundryLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testErrorLimitaInferioara() {
		Grupa grupa = new Grupa(10);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testErrorLimitaSuperioara() {
		Grupa grupa = new Grupa(2000);
	}
	
	@Test(timeout = 500)
	public void testPerformance() {
		Grupa grupa = new Grupa (1085);
	}
	
	@Test
	public void testExistence() {
		Grupa grupa = new Grupa(1085);
		assertNotNull(grupa.getStudenti());
		
	}
	}
