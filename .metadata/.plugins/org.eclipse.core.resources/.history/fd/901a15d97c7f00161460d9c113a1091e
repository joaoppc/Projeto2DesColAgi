package br.edu.insper.agile.controller;

public class XorGate extends LogicGate{
	InputPin pinA;
	InputPin pinB;
	
	public XorGate(InputPin pinA,InputPin pinB) {
		this.pinA = pinA;
		this.pinB = pinB;
	}

	
	AndGate and1;
	AndGate and2;
	AndGate and3;
	AndGate and4;
	
	
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
		//podemos construir usando portas and ja existentes
		and1 = new AndGate(pinA, pinB);
		and2 = new AndGate(pinA, new InputPin(and1,0)); //jeito mais esperto de fazer, mas nao sei se da certo
		and3 = new AndGate(pinB, new InputPin(new Switch(!and1.getOutputValue(0)),0)); //jeito burro de fazer, mas tem que dar certo
		and4 = new AndGate(new InputPin(new Switch(!and2.getOutputValue(0)),0),new InputPin(new Switch(!and3.getOutputValue(0)),0));
		
		return !and4.getOutputValue(index);
		
	}
}
