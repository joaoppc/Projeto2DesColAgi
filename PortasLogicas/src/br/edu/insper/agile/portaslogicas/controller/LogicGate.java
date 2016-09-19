package br.edu.insper.agile.portaslogicas.controller;

public abstract class LogicGate implements Source, Drain {
	
	InputPin pin;
	
	public InputPin getInputPin(int index) {
		return pin;
	}
	public boolean getOutputValue(int index) {
		return pin.getOutputValue(index);
	}
}
