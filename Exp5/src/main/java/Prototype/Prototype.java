package Prototype;

import java.util.HashMap;
import java.util.Map;


public class Prototype {

    private static Map<String, Student> studentsList = new HashMap<String, Student>();

    static {
        studentsList.put("Iranian", new IranianStudent());
        studentsList.put("Japanese", new JapaneseStudent());
    }

    public static Student getStudent(String studentNationality) {
        return (Student) studentsList.get(studentNationality).clone();
    }
}

