package br.edu.insper.agile.controller;

public class NotGate extends LogicGate{
	private InputPin pinA;
	
	public NotGate(InputPin pinA) {
		this.pinA = pinA;
	}
	
	@Override
	public InputPin getInputPin(int index) {
		return pinA;
	}
	
	@Override
	public boolean getOutputValue(int index) {
		boolean SinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		
		return !SinalA;	
	}
	
	
	

}
