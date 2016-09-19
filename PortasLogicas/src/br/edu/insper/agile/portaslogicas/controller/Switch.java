package br.edu.insper.agile.portaslogicas.controller;

public class Switch implements Source {
	boolean signal;
	
	public boolean getOutputValue(int index) {
		return signal;
	}

}
