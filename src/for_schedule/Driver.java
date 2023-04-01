package for_schedule;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args)throws IOException{

		
		System.out.println("What's your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("What's your major: ");
		String major = scan.next();
		
		CourseList cl = new CourseList();
		cl.courseList();
		
		if(UserExists(name)) {
			AddClasses(name, cl.getCatalog());
		}else {
			CreateProfile(name, major);
			AddClasses(name, cl.getCatalog());
		}
		
			
	}
	static void AddClasses(String name, ArrayList<Course> cls) {
        try {
            File writeFile = new File(name + ".json");
            FileWriter fw = new FileWriter(writeFile, true);
            for (int i = 0; i < cls.size(); i++) {
                fw.write(cls.get(i) + "\r\n");
            }
            fw.close();
        } catch (Exception e) {}
    }
    static boolean UserExists (String name) {
        try {
            File readFile = new File(name + ".json");
            if (readFile.exists()) {
                return true;
            }
        }  catch (Exception e) {return false;}
        return false;
    }
    static void CreateProfile(String name, String major) {
        try {
            File writeFile = new File(name + ".json");
            FileWriter fw = new FileWriter(writeFile, true);
            fw.write(name + "," + major + "\r\n");
            fw.close();
        } catch (Exception e) {}
    }
}


