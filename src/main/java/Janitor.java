
public class Janitor extends Employee implements HasVitals {

	private int bloodLevel;
	private int healthLevel;
	private int salary;
	private String empTitle;
	private Boolean isAvailable;

	private int sweepSkill;

	public Janitor(String empID, String empName, boolean isAvailable, int sweepSkill) {

		super(empID, empName, isAvailable);
		this.empTitle = "Janitor";
		this.bloodLevel = BLOOD_LEVEL + 20;
		this.healthLevel = HEALTH_LEVEL;
		this.salary = 40000;
		this.empTitle = "Janitor";

		this.sweepSkill = sweepSkill;

		this.isAvailable = isAvailable;

	}

	public int getBloodLevel() {
		return this.bloodLevel;
	}

	public int getSweepSkill() {
		return sweepSkill;
	}

	public int getHealthLevel() {
		if (this.bloodLevel == 0) {
			this.healthLevel = 0;
		} else if (this.bloodLevel > 0 && this.bloodLevel <= 19) {
			this.healthLevel = 5;
		} else if (this.bloodLevel >= 20 && this.bloodLevel <= 29) {
			this.healthLevel = 10;
		} else if (this.bloodLevel >= 30 && this.bloodLevel <= 39) {
			this.healthLevel = 15;
		} else if (this.bloodLevel >= 40 && this.bloodLevel <= 49) {
			this.healthLevel = 20;
		}
		return healthLevel;
	}

	public String getEmpTitle() {
		return empTitle;
	}

	@Override
	public int calculatePay() {
		return salary;
	}

	public void busy() {
		super.busy();
	}

	public String busyStatus() {
		if (!getIsAvailable()) {
			return "SWEEPING";
		} else {
			return "AVAILABLE";
		}
	}

	@Override
	public void isBitten() {
		this.bloodLevel -= 10;
		
	}

}
