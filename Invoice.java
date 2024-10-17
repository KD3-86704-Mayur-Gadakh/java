package invoiceimplementation;

public class Invoice {
	
	
	
	
	String partNumber;
	String partDescription;
	int purchesdItems;
	double pricePerItem;
	
	
	
	
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getPurchesdItems() {
		return purchesdItems;
	}

	public void setPurchesdItems(int purchesdItems) {
		this.purchesdItems = purchesdItems;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public Invoice(String partNumber, String partDescription, int purchesdItems, double pricePerItem) {
	if(purchesdItems<0) {
		setPurchesdItems(0);
	}
	else {
		this.purchesdItems = purchesdItems;
	}
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(pricePerItem<0) {
			setPricePerItem(0.0);
		}else {
			this.pricePerItem = pricePerItem;
		}
		
	}

	public void display() {
		System.out.println("part number :"+partNumber);
		System.out.println("part Description :"+partDescription);
		System.out.println("purchesed Items :"+purchesdItems);
		System.out.println("Price Items :"+pricePerItem*purchesdItems);
	}
	
}
