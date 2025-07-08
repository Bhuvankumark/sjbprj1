package dsaprj.mca.dsa;

import java.util.Objects;

public class Product {
	 public int prdid;
	 String prdName;
	 double prdPrice;
	public Product(int prdid, String prdName, double prdPrice) {
		super();
		this.prdid = prdid;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [prdid=" + prdid + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(prdName, prdPrice, prdid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(prdName, other.prdName)
				&& Double.doubleToLongBits(prdPrice) == Double.doubleToLongBits(other.prdPrice) && prdid == other.prdid;
	}

}
