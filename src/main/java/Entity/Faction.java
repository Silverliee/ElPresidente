package Entity;

public class Faction {
	// Const for factions names
	public static String capitalist = "Les capitalistes";
	public static String communist = "Les communistes";
	public static String liberal = "Les libéraux";
	public static String religious = "Les religieux";
	public static String militarist = "Les militaristes";
	public static String ecologist = "Les écologiste";
	public static String nationalist = "Les nationalistes";
	public static String loyalist = "Les loyalistes";

	// Class attributes
	private final String name;
	private int partisan;
	private int satisfaction;

	// Class constructor
	public Faction(String name, int partisan, int satisfaction) {
		this.name = name;
		this.partisan = partisan;
		this.satisfaction = satisfaction;
	}

	//Getters and setter
	public String getName() {
		return name;
	}

	public int getPartisan() {
		return partisan;
	}

	public void setPartisan(int partisan) {
		this.partisan = partisan;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	//Class methods
	public boolean isEnnemy() {
		return this.satisfaction == 0;
	}

	public void bride() {

	}
}
