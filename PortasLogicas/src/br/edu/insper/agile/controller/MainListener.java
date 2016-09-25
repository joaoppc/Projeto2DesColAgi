package br.edu.insper.agile.controller;
import br.edu.insper.agile.model.*;

public interface MainListener {
	public void stateChanged(boolean stateA, boolean stateB, boolean c,LogicGate gate);
}
