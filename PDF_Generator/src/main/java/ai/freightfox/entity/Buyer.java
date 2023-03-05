package ai.freightfox.entity;

public class Buyer {

	private String buyerName;

	private String buyerGstin;

	private String buyerAddress;

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerGstin() {
		return buyerGstin;
	}

	public void setBuyerGstin(String buyerGstin) {
		this.buyerGstin = buyerGstin;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	@Override
	public String toString() {
		return "Buyer [buyerName=" + buyerName + ", buyerGstin=" + buyerGstin + ", buyerAddress=" + buyerAddress + "]";
	}

}
