package Bean;

public class Account {

	private int accno;
	private String name;
	private int amount;

	public Account(int accno, String name, int amount) {
		this.accno = accno;
		this.name = name;
		this.amount = amount;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setaccno(int accno) {
		this.accno = accno;
	}

	public void setamount(int amount) {
		this.amount = amount;
	}

	public String getname() {
		return name;
	}

	public int getaccno() {
		return accno;
	}

	public int getamount() {
		return amount;
	}

}
