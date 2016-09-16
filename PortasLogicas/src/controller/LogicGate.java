package controller;

public class LogicGate implements Source, Drain {
	Lamp lamp;
	Switch botao;
	
	public InputPin getInputPin(int index) {
		return lamp.getInputPin(index);
	}

	public boolean getOutputValue(int index) {
		return botao.getOutputValue(index);
	}

}
