package br.edu.insper.agile.controller;

import org.junit.Assert;
import org.junit.Test;

public class XnorGateTest {
	Switch botaoA;
	Switch botaoB;
	InputPin pinA;
	InputPin pinB;

	@Test
	public void falseFalse() {
		botaoA = new Switch(false);
		botaoB = new Switch(false);
		
		pinA = new InputPin(botaoA,0);
		pinB = new InputPin(botaoB,1);
		
		XnorGate xnor = new XnorGate(pinA,pinB);
		
		Assert.assertEquals(true, xnor.getOutputValue(0));
	}
	
	@Test
	public void trueFalse() {
		botaoA = new Switch(true);
		botaoB = new Switch(false);
		
		pinA = new InputPin(botaoA,0);
		pinB = new InputPin(botaoB,1);
		
		XnorGate xnor = new XnorGate(pinA,pinB);
		
		Assert.assertEquals(false, xnor.getOutputValue(0));
	}
	
	@Test
	public void falseTrue() {
		botaoA = new Switch(false);
		botaoB = new Switch(true);
		
		pinA = new InputPin(botaoA,0);
		pinB = new InputPin(botaoB,1);
		
		XnorGate xnor = new XnorGate(pinA,pinB);
		
		Assert.assertEquals(false, xnor.getOutputValue(0));
	}

	@Test
	public void trueTrue() {
		botaoA = new Switch(true);
		botaoB = new Switch(true);
		
		pinA = new InputPin(botaoA,0);
		pinB = new InputPin(botaoB,1);
		
		XnorGate xnor = new XnorGate(pinA,pinB);
		
		Assert.assertEquals(true, xnor.getOutputValue(0));
	}
}

