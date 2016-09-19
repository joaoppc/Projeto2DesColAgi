package br.edu.insper.agile.controller;

public class AndGate extends LogicGate{
	private InputPin pinA;
	private InputPin pinB;
	
	public AndGate(InputPin pinA, InputPin pinB) {
		this.pinA = pinA;
		this.pinB = pinB;
	}
	
	@Override
	public InputPin getInputPin(int index) {
		if (index == 0) {
			return pinA;
		}
		else {
			return pinB;
		}
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean SinalA = pinA.getSource().getOutputValue(1);
		boolean SinalB = pinB.getSource().getOutputValue(pinB.getIndex());
		
		return SinalA && SinalB;
	}

}
