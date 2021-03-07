package Entity;

import java.util.List;

import Exception.DevelopmentSectorsLimiteException;
import Exception.NotEnoughMoneyException;
import Exception.DevelopmentSectorNegativeValueException;

public class Country {
	// Class attributes
	private final String name;
	private int citizen;
	private int industry;
	private int agriculture;
	private int food;
	private int treasury;
	public final Faction capitalist;
	public final Faction communist;
	public final Faction liberal;
	public final Faction religious;
	public final Faction militarist;
	public final Faction ecologist;
	public final Faction nationalist;
	public final Faction loyalist;

	// Class constructor
	public Country(String name, int citizen, int industry, int agriculture, int food, int treasury, Faction capitalist, Faction communist, Faction liberal, Faction religious, Faction militarist, Faction ecologist, Faction nationalist, Faction loyalist) {
		this.name = name;
		this.citizen = citizen;
		this.industry = industry;
		this.agriculture = agriculture;
		this.food = food;
		this.treasury = treasury;
		this.capitalist = capitalist;
		this.communist = communist;
		this.liberal = liberal;
		this.religious = religious;
		this.militarist = militarist;
		this.ecologist = ecologist;
		this.nationalist = nationalist;
		this.loyalist = loyalist;
	}

	//Getters and setters
	public String getName() {
		return name;
	}

	public int getCitizen() {
		return citizen;
	}

	public int getIndustry() {
		return industry;
	}

	public int getAgriculture() {
		return agriculture;
	}

	public int getFood() {
		return food;
	}

	public int getTreasury() {
		return treasury;
	}

	public Faction getCapitalist() {
		return capitalist;
	}

	public Faction getCommunist() {
		return communist;
	}

	public Faction getLiberal() {
		return liberal;
	}

	public Faction getReligious() {
		return religious;
	}

	public Faction getMilitarist() {
		return militarist;
	}

	public Faction getEcologist() {
		return ecologist;
	}

	public Faction getNationalist() {
		return nationalist;
	}

	public Faction getLoyalist() {
		return loyalist;
	}

	//Class methods
	public void modifyNumberOfCitizen(int citizen) {
		this.citizen = citizen;
	}

	public void modifyIndustry(int industry) throws DevelopmentSectorsLimiteException, DevelopmentSectorNegativeValueException {
		if ((this.industry + this.agriculture + industry) > 100) {
			throw new DevelopmentSectorsLimiteException();
		} else if ((this.industry - industry) < 0) {
			throw new DevelopmentSectorNegativeValueException();
		} else {
			this.industry += industry;
		}
	}

	public void modifyAgriculture(int agriculture) throws DevelopmentSectorsLimiteException, DevelopmentSectorNegativeValueException {
		if ((this.industry + this.agriculture + agriculture) > 100) {
			throw new DevelopmentSectorsLimiteException();
		} else if ((this.agriculture - agriculture) < 0) {
			throw new DevelopmentSectorNegativeValueException();
		} else {
			this.agriculture += agriculture;
		}
	}

	public void modifyFood(int food) {
		this.food += food;
	}

	public void modifyTreasury(int treasury) {
		this.treasury += treasury;
	}

	public void generateIndustryGain() {
		this.treasury += 10 * this.industry;
	}

	public void generateAgricultureGain() {
		this.food += 40 * this.agriculture;
	}

	public void useTreasury(int amount) throws NotEnoughMoneyException {
		if (amount > this.treasury) {
			throw new NotEnoughMoneyException();
		} else {
			this.treasury -= amount;
		}
	}

	public void importFood(int amount) {
		try {
			this.useTreasury(amount * 8);
			this.food += amount;
		} catch (Exception e) {
		}
	}
}
