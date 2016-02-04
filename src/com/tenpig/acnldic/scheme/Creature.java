package com.tenpig.acnldic.scheme;

public class Creature {
	String name;
	int type; // 0:bug, 1:fish, 2:seafoods
	int envir;
	int[][] timetable;
	
	
	/*
	 * month : island 1 2 3 4 5 6 7 8 9 10 11 12 
	 * index : 
	 */
	public Creature()
	{
		timetable=new int[15][4];
	}
	
	
	
}
