package testmap;

import java.util.HashMap;
import java.util.Map;
import test.Students;
import test.Teacher;

public class TestMap {
    public static void main(String[] args) {
        Map<Students, Teacher> map = new HashMap<>();
        Students students=new Students("rohi", 1234, 3457, 4568);
//        Students student = new Students("John Doe", 101);
        Teacher teacher = new Teacher("Bangla", "Rohim", 123, 12345, 23456);
        map.put(students, teacher);
        
        System.out.println(map);
    }
}
