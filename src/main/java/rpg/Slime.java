package rpg;

public class Slime extends Enemy {
	private String color;

	public Slime(String name, int op, int dp, String color) {
		super(name, op, dp);
		this.color = color;
	}

	@Override
	public void greeting() {
		System.out.println(this.color + "の" + this.name + "が現れた！");
	}

	public void runaway() {
		System.out.println(this.name + "は逃げた！");
	}

}