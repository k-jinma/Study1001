
public class Main {

	public static void main(String[] args) {
		
		// レジを準備する
		Register register = new Register();
		
		// 商品を準備する
		Item onigiri1 = new Item(1, "しゃけおにぎり", 150);
		Item sandwich1 = new Item(2, "たまごサンド", 300);
		
		
		// レジに登録する
		register.addItem(onigiri1);
		register.addItem(sandwich1);
		
		
		// メニューを表示する（支払い、返品・・・）
		register.showMenu();
		
		
		int inputNo = 1; // 支払いを選択したとする
		
		int ortsuri = register.pay(500, onigiri1);
		
		
		System.out.println("おつりは" + ortsuri + "円です");
		
		
		register.changePrice(sandwich1, 500);

		

	}

}
