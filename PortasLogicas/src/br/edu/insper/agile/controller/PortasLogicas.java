package br.edu.insper.agile.controller;

import javax.swing.JFrame;

import br.edu.insper.agile.vision.MainView;
import br.edu.insper.agile.model.AndGate;
import br.edu.insper.agile.model.Switch;
import br.edu.insper.agile.model.InputPin;

public class PortasLogicas {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AndGate andGate = new AndGate(new InputPin(new Switch(false),0),new InputPin(new Switch(false),0));

				MainView view = new MainView();

				MainController controller = new MainController(andGate, view);

				view.addMainListener(controller);

				JFrame frame = new JFrame("SwingDemo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setContentPane(view);
                frame.pack();
                frame.setVisible(true);
            }
		});
	}
}
