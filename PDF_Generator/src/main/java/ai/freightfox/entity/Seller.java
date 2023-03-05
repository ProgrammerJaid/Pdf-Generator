package ai.freightfox.entity;

public class Seller {

	private String sellerName;

	private String sellerGstin;

	private String sellerAddress;

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerGstin() {
		return sellerGstin;
	}

	public void setSellerGstin(String sellerGstin) {
		this.sellerGstin = sellerGstin;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	@Override
	public String toString() {
		return "Seller [sellerName=" + sellerName + ", sellerGstin=" + sellerGstin + ", sellerAddress=" + sellerAddress
				+ "]";
	}

}
