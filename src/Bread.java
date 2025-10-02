				    //拡張（継承）
public class Bread extends Item {

	//賞味期限
	private String bestBefore;
	
	
	Bread(int no, String name, int price, String bestBefore) {
		super(no, name, price);
		this.bestBefore = bestBefore;

	}


	String getBestBefore() {
		return bestBefore;
	}


	void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}

}
