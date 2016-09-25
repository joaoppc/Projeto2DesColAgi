package br.edu.insper.agile.swingdemo;

public class MainController implements MainListener {
	private Person person;
	private MainView view;

	public MainController(Person person, MainView view) {
		this.person = person;
		this.view = view;

		this.view.setNumber(this.person.getSalary());

		updateView();
	}

	private void updateView() {
		if(person.isHappy()) {
			view.setText("Feliz");
		}
		else {
			view.setText("Triste");
		}
	}

	@Override
	public void numberChanged(int number) {
		person.setSalary(number);

		updateView();
	}
}
