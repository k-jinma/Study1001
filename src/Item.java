
public class Item {

	private int no; // 商品番号
	private String name; // 商品名
	private int price; // 価格
	
	// コンストラクタ
	Item(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	int getNo() {
		return no;
	}

	void setNo(int no) {
		this.no = no;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	
}
