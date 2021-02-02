package bean;

import java.time.LocalDate;

public class Product {
	private int pid;
	private String pname;
	private float price;
	private LocalDate storedate;

	public Product() {

		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, float price, LocalDate storedate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.storedate = storedate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LocalDate getStoredate() {
		return storedate;
	}

	public void setStoredate(LocalDate storedate) {
		this.storedate = storedate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", storedate=" + storedate + "]";
	}

}
