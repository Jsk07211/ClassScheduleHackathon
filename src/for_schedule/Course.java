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
	}
	@Override
	public String toString() {
		return name+" is offered in "+sem+" and covers the attribute "+attribute;
	}
}
