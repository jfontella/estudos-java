package entities;
import java.util.ArrayList;
import java.util.Calendar;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private String department;
	private ArrayList<HourContract> contracts = new ArrayList<>();
	
	public Worker(String name, WorkerLevel level, String department) {
		this.name = name;
		this.level = level;
		this.department = department;
	}
	public String checkContracts() {
		String msg = "";
		for (HourContract hourContract : contracts) {
			msg += "Data: ";
			msg += hourContract.getDate();
			msg += "\n";
			msg += "Horas trabalhadas: ";
			msg += hourContract.getHours();
			msg += "\n";
			msg += "Valor por hora: ";
			msg += hourContract.getValuePerHour();
			msg += "\n";
		}
		return msg;
	}
	
	public void addContract(HourContract contract) {		
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	public double incomePayment(int year, int month) {	
		double sum = 0;
		Calendar cal = Calendar.getInstance();
		for (HourContract contract : contracts) {
			cal.setTime(contract.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
		
	

}
