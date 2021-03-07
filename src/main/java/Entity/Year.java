package Entity;

public class Year {
	// Class attributes
	private final int number;
	private final Season winter;
	private final Season spring;
	private final Season summer;
	private final Season autumn;

	// Class constructor
	public Year(int number, Season winter, Season spring, Season summer, Season autumn) {
		this.number = number;
		this.winter = winter;
		this.spring = spring;
		this.summer = summer;
		this.autumn = autumn;
	}

	//Getters
	public int getNumber() {
		return number;
	}

	public Season getWinter() {
		return winter;
	}

	public Season getSpring() {
		return spring;
	}

	public Season getSummer() {
		return summer;
	}

	public Season getAutumn() {
		return autumn;
	}
}
