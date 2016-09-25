package br.edu.insper.agile.swingdemo;

public class Person {
	private boolean happy;
	private int salary;

	public Person() {
		setSalary(50);
	}

	public boolean isHappy() {
		return happy;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;

		if(this.salary < 50) {
			this.happy = false;
		}
		else {
			this.happy = true;
		}
	}
}
