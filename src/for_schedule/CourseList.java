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
		scnr.useDelimiter(",");
		
		
		while(scnr.hasNext()) {
			tSem = scnr.next().strip();
			tName = scnr.next();
			tType = scnr.next();
			tAttribute = scnr.next().strip();
			
			c = new Course(tSem, tName, tType, tAttribute);
			catalog.add(c);
		}
		scnr.close();
		
		for (Course c1 : catalog) {
			System.out.println(c1);
		}
	}
}
