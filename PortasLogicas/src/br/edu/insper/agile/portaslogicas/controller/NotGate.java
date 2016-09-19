package br.edu.insper.agile.portaslogicas.controller;

public class NotGate extends LogicGate{
	private InputPin pinA;
	
	@Override
	public boolean getOutputValue(int index) {
		boolean SinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		
		return !SinalA;
		
		
	}
	
	
	

}
