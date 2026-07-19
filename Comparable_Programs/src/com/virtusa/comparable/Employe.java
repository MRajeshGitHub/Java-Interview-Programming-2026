package com.virtusa.comparable;

public class Employe  implements Comparable<Employe>{

	private int id;
	private String name;
	private Double salary;
	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
		
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employe o) {
		// TODO Auto-generated method stub
		return this.salary.compareTo(o.salary);
	}
	
	
}
