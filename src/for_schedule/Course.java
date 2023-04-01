package for_schedule;

public class Course {
	protected String sem, name, type, attribute;
	protected boolean taken;
	public Course(String sem, String name, String type, String attribute) {
		this.sem = sem;
		this.name = name;
		this.type = type;
		this.attribute = attribute;
		taken = false;
		String[] course = {sem, name, type, attribute};
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public boolean isTaken() {
		return taken;
	}
	public void setTaken(boolean taken) {
		this.taken = taken;
	}

}


