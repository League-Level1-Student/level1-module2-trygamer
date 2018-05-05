/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * To make these tests pass, you will need to create a Minion class with the member variables below.
 * 
 * 
 * 			private String name; 
 * 			private int eyes; 
 * 			private String color; 
 * 			private String master;
 * 
 * 
 * Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will pass.
 * 
 * **/

public class MinionTest {

	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("yellow", stuart.getColor());

		Minion dave = new Minion("Dave", 2, "yellow", "");
		assertEquals("Dave", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("yellow", dave.getColor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}

	class Minion {
		
		Minion(String name, int eyes, String color, String Master){
			
			this.name= name;
			this.color= color;
			this. eyes= eyes;
			this. Master= Master;
		}
		
		
		Minion stuart =new Minion("Stuart", 1,"yellow", "") ;
		Minion dave =new Minion("Dave", 2, "yellow", "");
			
		
		
private String name;
		
		String getName() {
			
			
			return name;
		}
		
		void getName(String name) {
			this.name= name;
			
		}
		
		private int eyes;
		
		int getEyes() {
			
			return eyes;
			
			
		}
		private String color;
		
		String getColor() {
			

			return color;
		}
		private String Master;
		
		String getMaster() {
			
			
			return Master;
		
		
		
		
		
		
	}
	
	
	}}



