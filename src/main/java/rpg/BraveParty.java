package rpg;

public class BraveParty {
	String name; // 名前
	int hp; // ヒットポイント
	int op; // 攻撃力
	int dp; // 守備力

	// 引数無しコンストラクタ
	public BraveParty() {
		this.name = "勇者"; // 初期値が決まっている場合は指定もできる
		this.hp = 100;
		this.op = 20;
		this.dp = 15;
	}

	// 引数有りコンストラクタ
	public BraveParty(String name, int hp, int op, int dp) {
		this.name = name;
		this.hp = hp;
		this.op = op;
		this.dp = dp;
	}

	public void attack() {
		System.out.println(name + "の攻撃！");
		System.out.println(name + "は、" + op + "のダメージを与えた！");
	}

	public void rest() {
		this.hp += 50;
		System.out.println(name + "は宿で休んだ");
		System.out.println(name + "のHPが50回復した");
	}
}