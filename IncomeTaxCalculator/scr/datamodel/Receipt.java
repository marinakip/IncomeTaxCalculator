package datamodel;

public class Receipt {
	private int id;
	private String date;
	private String kind;
	private int amount;
	private Company company;
	
	public Receipt(int id, String date, String kind, int amount, Company company){
		setId(id);
		setDate(date);
		setKind(kind);
		setAmount(amount);
		setCompany(company);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	

}
