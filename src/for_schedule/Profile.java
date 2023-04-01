package for_schedule;

import java.io.*;
import java.util.*;

public class Profile {
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

