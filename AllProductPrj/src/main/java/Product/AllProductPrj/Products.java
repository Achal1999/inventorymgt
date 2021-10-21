package Product.AllProductPrj;

public class Products 
{
	private int pid;
	private String pName;
	private String pPrice;
	private int pItems;
	private String pCompanyName;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	public int getpItems() {
		return pItems;
	}
	public void setpItems(int pItems) {
		this.pItems = pItems;
	}
	public String getpCompanyName() {
		return pCompanyName;
	}
	public void setpCompanyName(String pCompanyName) {
		this.pCompanyName = pCompanyName;
	}
	public Products(int pid, String pName, String pPrice, int pItems, String pCompanyName) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pItems = pItems;
		this.pCompanyName = pCompanyName;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pName=" + pName + ", pPrice=" + pPrice + ", pItems=" + pItems
				+ ", pCompanyName=" + pCompanyName + "]";
	}
	
	
	//achal

}
