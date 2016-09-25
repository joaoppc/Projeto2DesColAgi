package br.edu.insper.agile.vision;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.edu.insper.agile.controller.MainListener;
import br.edu.insper.agile.model.*;

public class MainView extends JPanel implements ChangeListener {
	private static final long serialVersionUID = 1L;
	
	
	private JCheckBox inputPinA;
	private JCheckBox inputPinB;
	private JCheckBox inputPinC;
	private JCheckBox outputPin;
	private JCheckBox outputPinCa;
	
	private LogicGate and =  new AndGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),0));
	private LogicGate or  = new OrGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),0));
	private LogicGate not = new NotGate(new InputPin(new Switch(false),0));
	private LogicGate ha = new HalfAdderGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),1));
	private LogicGate fa = new FullAdderGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),1),new InputPin(new Switch(false),2));
	private LogicGate xor = new XorGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),0));
	private LogicGate xnor = new XnorGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),0));
	
	private JComboBox<LogicGate> gateSelector;
	

	private JLabel label;
	private List<MainListener> listeners;

	
	
	public MainView() {
		
		this.inputPinA = new JCheckBox("Pin A");
		inputPinA.addChangeListener(this); //toda vez que eu mudar o estado desse checkbox, ele vai ''ouvir''.
		
		this.inputPinB = new JCheckBox("Pin B");
		inputPinA.addChangeListener(this);

		this.inputPinC = new JCheckBox("Pin C (Adders Only)");
		inputPinA.addChangeListener(this);
		
		this.outputPin = new JCheckBox("Out");
		outputPin.setEnabled(false);
		
		this.outputPinCa = new JCheckBox("Carry (Adders only)");
		outputPinCa.setEnabled(false);
		
		this.gateSelector = new JComboBox<LogicGate>();
        gateSelector.addItem(and);
        gateSelector.addItem(or);
        gateSelector.addItem(not);
        gateSelector.addItem(ha);
        gateSelector.addItem(fa);
        gateSelector.addItem(xor);
        gateSelector.addItem(xnor);
		gateSelector.addActionListener(gateSelector);

		
		this.label = new JLabel();

		this.setPreferredSize(new Dimension(450, 225));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.add(this.inputPinA);
		this.add(this.inputPinB);
		this.add(this.inputPinC);
		this.add(this.outputPin);
		this.add(this.outputPinCa);
		this.add(this.gateSelector);
		this.add(this.label);

		
		this.listeners = new ArrayList<>(); //cria lista dos ouvidores...
	}
	
	
	public void setOutputPin(boolean b) {
		outputPin.setSelected(b);
	}


	public void setText(String text) {
		label.setText(text);
	}

	public void addMainListener(MainListener listener) {
		listeners.add(listener); //adiciona um ouvidor na lista
	}

	@Override
	public void stateChanged(ChangeEvent event) {
		LogicGate gate = (LogicGate) this.gateSelector.getSelectedItem();
		boolean stateA = (boolean) this.inputPinA.isSelected(); //vai me devolver o estado do pinA
		boolean stateB = (boolean) this.inputPinB.isSelected(); // " pinB
		boolean stateC = (boolean) this.inputPinC.isSelected(); // " pinB

		for(MainListener listener: listeners) { //para todos os ouvidores da lista...
			listener.stateChanged(stateA, stateB, stateC, gate); //...conta para cada um o estado do checkbox InputPinA e InputPinB
		}
		
		
	}
}

