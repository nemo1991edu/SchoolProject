public class Course {
	private String CName;
	private int Dur;
	private Instructor Ins;
	
	public Course(String cName, int dur, Instructor ins) {
		setCName(cName);
		setDur(dur);
		setIns(ins);
	}
	
	// getters
	public String getCName() {
		return CName;
	}
	public int getDur() {
		return Dur;
	}
	public Instructor getIns() {
		return Ins;
	}
	
	// setters
	public void setCName(String cName) {
		if (!cName.isEmpty() && !cName.equalsIgnoreCase(null)) {
			this.CName = cName;
		} else {
			this.CName = "Unknown";
		}
	}
	public void setDur(int dur) {
		if (dur > 4) {
			this.Dur = dur;
		} else {
			this.Dur = 4;
		}
	}
	public void setIns(Instructor ins) {
		this.Ins = ins;
	}
}
