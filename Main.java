import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import pkg.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("ahmed", 10);
        Student student2 = new Student("jaamac", 4);
        Student student3 = new Student("muse", 2);
        Student student4 = new Student("arnab", 4);

        // LISTS AND COLLECTIONS
        List<Integer> ints = new ArrayList<>();
        HashSet<String> restaurants = new HashSet<>(); // this is for storing unique values in a array that's dynamic
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Javascript");
        map.put(102, "Java");
        map.put(103, "GITHUB");

        System.out.println(map.isEmpty());
        // and expandable
        restaurants.add("ahmed");
        restaurants.add("ahmed");
        restaurants.add("arnab");

        for (String res : restaurants) {
            System.out.println(res);
        }

        student1.printStudentInfo();

        ArrayList<Student> students = new ArrayList<>();
        students.add(student4);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            student.printStudentInfo();
        }

        try {
            student1.generateStudentScore(1);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
