package com.ClassObject;

class Stud {
	private int roll;
	private String name ;
	
	public void setRoll(int r) {
		roll = r;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

}
public class GetterAndSetter {
		public static void main(String[] args) {
		Stud s = new Stud();
		s.setName("Vipul");
		System.out.println(s.getName());
		s.setRoll(1);
		System.out.println(s.getRoll());
		}

}
