package Entity;

public class Choice {
	// Class attributes
	private final int number;
	private final String description;
	private final int impactOnCapitalist;
	private final int impactOnCommunist;
	private final int impactOnLiberal;
	private final int impactOnReligious;
	private final int impactOnMilitarist;
	private final int impactOnEcologist;
	private final int impactOnNationalist;
	private final int impactOnLoyalist;
	private final int impactOnIndustry;
	private final int impactOnAgriculture;
	private final int impactOnFood;
	private final int impactOnTreasury;

	// Class constructor
	public Choice(
			int number,
			String description, int impactOnCapitalist,
			int impactOnCommunist,
			int impactOnLiberal,
			int impactOnReligious,
			int impactOnMilitarist,
			int impactOnEcologist,
			int impactOnNationalist,
			int impactOnLoyalist,
			int impactOnIndustry,
			int impactOnAgriculture,
			int impactOnFood,
			int impactOnTreasury) {
		this.number = number;
		this.description = description;
		this.impactOnCapitalist = impactOnCapitalist;
		this.impactOnCommunist = impactOnCommunist;
		this.impactOnLiberal = impactOnLiberal;
		this.impactOnReligious = impactOnReligious;
		this.impactOnMilitarist = impactOnMilitarist;
		this.impactOnEcologist = impactOnEcologist;
		this.impactOnNationalist = impactOnNationalist;
		this.impactOnLoyalist = impactOnLoyalist;
		this.impactOnIndustry = impactOnIndustry;
		this.impactOnAgriculture = impactOnAgriculture;
		this.impactOnFood = impactOnFood;
		this.impactOnTreasury = impactOnTreasury;
	}

	//Getters
	public int getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}

	public int getImpactOnCapitalist() {
		return impactOnCapitalist;
	}

	public int getImpactOnCommunist() {
		return impactOnCommunist;
	}

	public int getImpactOnLiberal() {
		return impactOnLiberal;
	}

	public int getImpactOnReligious() {
		return impactOnReligious;
	}

	public int getImpactOnMilitarist() {
		return impactOnMilitarist;
	}

	public int getImpactOnEcologist() {
		return impactOnEcologist;
	}

	public int getImpactOnNationalist() {
		return impactOnNationalist;
	}

	public int getImpactOnLoyalist() {
		return impactOnLoyalist;
	}

	public int getImpactOnIndustry() {
		return impactOnIndustry;
	}

	public int getImpactOnAgriculture() {
		return impactOnAgriculture;
	}

	public int getImpactOnFood() {
		return impactOnFood;
	}

	public int getImpactOnTreasury() {
		return impactOnTreasury;
	}
}
