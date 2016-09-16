package controller;

public class Switch implements Source {
	boolean signal;
	
	public boolean getOutputValue(int index) {
		return signal;
	}

}
