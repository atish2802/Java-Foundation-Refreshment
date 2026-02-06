package com.AbstractAndInterface;

interface TvRemote{
	void Button();
}

interface SmartTvRemote extends TvRemote{
	void Assistant();
}

class Tv implements SmartTvRemote{

	@Override
	public void Button() {
		System.out.println("Pressing Button...");
	}
	public void Assistant() {
		System.out.println("Requesting for Assistance ....");
	}
	
}
public class Excercise3 {
	public static void main(String[] args) {
		TvRemote  t = new Tv();
		t.Button();
		
		
		SmartTvRemote st = new Tv();
		st.Assistant();
		st.Button();
		
	}
}
