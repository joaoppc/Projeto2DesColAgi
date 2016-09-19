package br.edu.insper.agile.portaslogicas.controller;

public class FullAdder extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	private InputPin carry;
	
	
		
	@Override
	public boolean getOutputValue(int index) {
		boolean SinalA = pinA.getSource().getOutputValue(pinA.getIndex());
		boolean SinalB = pinB.getSource().getOutputValue(pinB.getIndex());
		boolean SinalCarry = carry.getSource().getOutputValue(carry.getIndex());
		
		boolean xor = (!SinalA && SinalB) || (!SinalB && SinalA);
		boolean xor2 = (!xor && SinalCarry) || (xor && !SinalCarry);
		
		
		}
		
		
	}

