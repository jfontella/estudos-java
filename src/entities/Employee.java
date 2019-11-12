package entities;

public class Employee {
	
	String name;
	int id;
	double grossSalary;
	double tax;
	
	public Employee(String name, int id, double grossSalary) {
		this.name = name;
		this.id = id;
		this.grossSalary = grossSalary;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	

	public double netSalary() {
		return grossSalary - tax;
	}
	public double increaseSalary(double percentage) {
		return grossSalary += percentage / 100 * grossSalary;
	}

}
