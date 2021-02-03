package bean;

public class Product {
	private int pid;
	private String pname;
	private float price;
	private String storeDate = null;

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

	public String getStoreDate() {
		return storeDate;
	}

	public void setStoreDate(String storeDate) {
		this.storeDate = storeDate;
	}

	@Override
	public String toString() {
		return "Product id=" + pid + ", Product name=" + pname + ", price=" + price + ", Date=" + storeDate;
	}

}
