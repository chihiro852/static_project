package rpg;

public class RPG {

	public static void main(String[] args) {

		BraveParty brave = new BraveParty();
		//		brave.name = "勇者";
		//		brave.hp = 100;
		//		brave.op = 20;
		//		brave.dp = 15;

		BraveParty warrior = new BraveParty("戦士", 90, 15, 15);
		//		warrior.name = "戦士";
		//		warrior.hp = 90;
		//		warrior.op = 15;
		//		warrior.dp = 15;

		System.out.println("----------------");
		System.out.println(brave.name + "     " + warrior.name);
		System.out.println("HP：" + brave.hp + "　HP：" + warrior.hp);
		System.out.println("----------------");

		brave.attack();
		warrior.rest();

		System.out.println("----------------");
		System.out.println(brave.name + "     " + warrior.name);
		System.out.println("HP：" + brave.hp + "　HP：" + warrior.hp);
		System.out.println("----------------");

		Slime slime = new Slime("スライム", 5, 5, "青色");
		slime.greeting();
		slime.attack();
		slime.runaway();

	}

}