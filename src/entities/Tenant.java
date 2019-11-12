package entities;

public class Tenant {
	
	private String name;
	private String mail;
	private boolean paid;
	
	public Tenant(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

	
	
}
