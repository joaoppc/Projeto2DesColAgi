package br.edu.insper.agile.swingdemo;

import javax.swing.JFrame;

public class SwingDemo {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Person person = new Person();

				MainView view = new MainView();

				MainController controller = new MainController(person, view);

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
