package br.edu.insper.agile.controller;

public abstract class LogicGate implements Source, Drain {
	
	public abstract InputPin getInputPin(int index);

	public abstract boolean getOutputValue(int index);

}
