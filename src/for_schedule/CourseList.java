package for_schedule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseList {
	protected ArrayList<Course> catalog;
	
	public void courseList()throws IOException{
		String tSem;
		String tName;
		String tType;
		String tAttribute;
		Course c;
		
		catalog = new ArrayList<>();
		Scanner scnr = new Scanner(new File("courseList.txt"));
		Scanner scan = new Scanner(System.in);
		scnr.useDelimiter(",");
		
		
		while(scnr.hasNext()) {
			tSem = scnr.next().strip();
			tName = scnr.next();
			tType = scnr.next();
			tAttribute = scnr.next().strip();
			c = new Course(tSem, tName, tType, tAttribute);
			System.out.println("Did you take this class?" + c.getName());
			if(scan.next().equals("NO")) {
				catalog.add(c);
			}
		}
		scnr.close();
		
		
		
	}

	public ArrayList<Course> getCatalog() {
		return catalog;
	}

	public void setCatalog(ArrayList<Course> catalog) {
		this.catalog = catalog;
	}
	
	public String get(int i){
		return catalog.get(i).getName();
	}
}
