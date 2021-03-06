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
	private List<Faction> factions;

	// Class constructor
	public Country(String name, int citizen, int industry, int agriculture, int food, int treasury, List<Faction> factions) {
		this.name = name;
		this.citizen = citizen;
		this.industry = industry;
		this.agriculture = agriculture;
		this.food = food;
		this.treasury = treasury;
		this.factions = factions;
	}

	//Getters
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

	public List<Faction> getFactions() {
		return factions;
	}

	//Class methods
	public void modifyNumberOfCitizen(int citizen) {
		this.citizen = citizen;
	}

	public void increaseIndustry(int industry) throws DevelopmentSectorsLimiteException {
		if ((this.industry + this.agriculture + industry) > 100) {
			throw new DevelopmentSectorsLimiteException();
		} else {
			this.industry += industry;
		}
	}

	public void decreaseIndustry(int industry) throws DevelopmentSectorNegativeValueException {
		if ((this.industry - industry) < 0) {
			throw new DevelopmentSectorNegativeValueException();
		} else {
			this.industry -= industry;
		}
	}

	public void increaseAgriculture(int agriculture) throws DevelopmentSectorsLimiteException {
		if ((this.industry + this.agriculture + agriculture) > 100) {
			throw new DevelopmentSectorsLimiteException();
		} else {
			this.agriculture += agriculture;
		}
	}

	public void decreaseAgriculture(int agriculture) throws DevelopmentSectorNegativeValueException {
		if ((this.agriculture - agriculture) < 0) {
			throw new DevelopmentSectorNegativeValueException();
		} else {
			this.agriculture -= agriculture;
		}
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
