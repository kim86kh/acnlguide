package com.tenpig.acnldic.scheme;

public class Creature {
	String name;
	int type; // 0:bug, 1:fish, 2:seafoods
	int envir;
	int[][] timetable;
	
	public Creature()
	{
		timetable=new int[15][4];
	}
	
	
	
}
