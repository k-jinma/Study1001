
public class Register {
	
	Item[] items = new Item[100]; // 商品を100個まで登録できる
	int itemCount = 0; // 登録した商品数
	
	
	//メニューを表示する
	void showMenu() {
		System.out.println("１：支払い");
		System.out.println("２：返品");
	}
	
	//支払いする
	int pay(int shiharaiGaku, Item i) {
		System.out.println("支払いしました");
		int otsuri = shiharaiGaku - i.getPrice();
		return otsuri;
	}
	
	//商品を登録する
	void addItem(Item item) {
		this.items[itemCount] = item; // とりあえず最初の要素に登録
		itemCount++; // 登録した商品数を1増やす
		
		System.out.println(item.getName() + "を登録しました");
	}
	
	//商品の値段を変更する
	void changePrice(Item item, int newPrice) {
		// item.price = newPrice;
		item.setPrice(newPrice);
		System.out.println(item.getName() + "の値段を" + newPrice + "円に変更しました");
	}

}
