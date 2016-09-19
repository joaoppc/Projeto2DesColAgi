package br.edu.insper.agile.portaslogicas.controller;

public class AndGate extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean SinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean SinalB = pinB.getSource().getOutputValue(pinB.getIndex());
		
		return SinalA && SinalB;
		
		
	}

}
