package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Course physics = new Course("Physics");
        Course history = new Course("History");
        Course biology = new Course("Biology");

        Student student = new Student("Aria", 101, 91, 20, "Female", physics, history);
        Student student1 = new Student("Leo", 102, 78, 21, "Male", history, biology);
        Student student2 = new Student("Nina", 103, 83, 22, "Female", biology, physics);
        Student student3 = new Student("Kai", 104, 89, 19, "Male", history, physics);
        Student student4 = new Student("Zara", 105, 74, 20, "Female", biology, history);

        Teacher teacher1 = new Teacher("Dr. Smith", physics, 201, 45, "Male");
        Teacher teacher2 = new Teacher("Ms. Allen", biology, 202, 38, "Female");
        Teacher teacher3 = new Teacher("Mr. Lee", history, 203, 50, "Male");

        Exam exam1 = new Exam(physics, student, teacher1, 95, "18 May");
        Exam exam2 = new Exam(history, student1, teacher3, 87, "21 May");
        Exam exam3 = new Exam(biology, student2, teacher2, 92, "25 May");

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student1);
            objectMapper.writeValue(new File("student2.json"), student2);
            objectMapper.writeValue(new File("student3.json"), student3);
            objectMapper.writeValue(new File("student4.json"), student4);
            objectMapper.writeValue(new File("teacher1.json"), teacher1);
            objectMapper.writeValue(new File("teacher2.json"), teacher2);
            objectMapper.writeValue(new File("teacher3.json"), teacher3);
            objectMapper.writeValue(new File("course1.json"), physics);
            objectMapper.writeValue(new File("course2.json"), history);
            objectMapper.writeValue(new File("course3.json"), biology);
            objectMapper.writeValue(new File("exam1.json"), exam1);
            objectMapper.writeValue(new File("exam2.json"), exam2);
            objectMapper.writeValue(new File("exam3.json"), exam3);

            System.out.println("Updated data has been written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
