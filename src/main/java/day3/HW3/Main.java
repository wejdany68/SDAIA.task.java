package day3.HW3;

public class Main {


        public static void main(String[] args) {
            School school = new School();

            Student student1 = new Student("Wejdan", 19, "789 Pine St", 1001, "Biology");
            Student student2 = new Student("Asma", 23, "321 Elm St", 1002, "Chemistry");
            Student student3 = new Student("Emily", 20, "654 Maple St", 1003, "Environmental Science");

            school.addStudent(student1);
            school.addStudent(student2);
            school.addStudent(student3);

            System.out.println("All Students:");
            school.displayAllStudents();

            school.sortStudentsByName();
            System.out.println("All Students (sorted by name):");
            school.displayAllStudents();

            Student foundStudent = school.findStudentById(1002);
            System.out.println("Found Student with ID 1002: " + foundStudent);

            school.writeStudentsToFile("students.txt");
            System.out.println("Students written to file.");

            School newSchool = new School();
            newSchool.readStudentsFromFile("students.txt");
            System.out.println("Students read from file:");
            newSchool.displayAllStudents();
        }
    }

