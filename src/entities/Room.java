package entities;

public class Room {
	
	private int number;
	private double price;
	private boolean avaible;
	private Tenant tenant = new Tenant("Reservado", "mail@mail.com");
	
	
	public Room(int number, double price, boolean avaible) {
		this.number = number;
		this.price = price;
		this.avaible = avaible;
	}
	


	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvaible() {
		return avaible;
	}
	public void setAvaible(boolean avaible) {
		this.avaible = avaible;
	}

	public String getTenant() {
		return tenant.getName();
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public String getRoomInfo() {
		return  "Numero: " + this.getNumber() + "\n"
				+ "Cliente: " + tenant.getName() + "\n"
				+ "Email: " + tenant.getMail() + "\n"
				+ "Pago :" + tenant.isPaid();
	}
	
	

}
