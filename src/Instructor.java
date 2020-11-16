public class Instructor {
	private String FName;
	private String LName;
	private String PNumber;
	private int Exp;
	
	public Instructor(String fName, String lName, String pNumber, int Exp) {
		setFName(fName);
		setLName(lName);
		setPNumber(pNumber);
		setExp(Exp);
	}
	
	public String getSta(int Exp) {
		switch(Exp) {
		case 1:
			return "junior";
		case 2:
		case 3:
		case 4:
			return "intermediate";
		default:
			return "senior";
		}
	}
	
	// getters
	public String getFName() {
		return FName;
	}
	public String getLName() {
		return LName;
	}
	public String getPNumber() {
		return PNumber;
	}
	public int getExp() {
		return Exp;
	}
	
	// setters
	public void setFName(String fName) {
		if (!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.FName = fName;
		} else {
			this.FName = "Unknown";
		}
	}
	public void setLName(String lName) {
		if (!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.LName = lName;
		} else {
			this.LName = "Unknown";
		}
	}
	public void setPNumber(String pNumber) {
		if (!pNumber.isEmpty() && !pNumber.equalsIgnoreCase(null)) {
			this.PNumber = pNumber;
		} else {
			this.PNumber = "Unknown";
		}
	}
	public void setExp(int Exp) {
		if (Exp > 1) {
			this.Exp = Exp;
		} else {
			this.Exp = 1;
		}
	}
}
