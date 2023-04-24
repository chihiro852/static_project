package rpg;

public class Enemy {
	String name;
	int op;
	int dp;

	public Enemy(String name, int op, int dp) {
		this.name = name;
		this.op = op;
		this.dp = dp;
	}

	public void greeting() {
		System.out.println(this.name + "が現れた！");
	}

	public void attack() {
		System.out.println(this.name + "は、" + this.dp + "のダメージを与えた！");
	}

}