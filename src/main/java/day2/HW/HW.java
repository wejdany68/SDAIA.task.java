package day2.HW;


    import java.util.ArrayList;

    class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    class StudentManager {
        private ArrayList<Student> students;

        public StudentManager() {
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public Student getStudentById(int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    return student;
                }
            }
            return null; // Return null if student not found
        }

        public ArrayList<Student> getAllStudents() {
            return students;
        }

        public boolean removeStudentById(int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    students.remove(student);
                    return true; // Return true if student removed successfully
                }
            }
            return false; // Return false if student not found
        }
    }

    class Main {
        public static void main(String[] args) {
            // Create Student objects
            Student student1 = new Student("Alice", 1);
            Student student2 = new Student("Bob", 2);
            Student student3 = new Student("Charlie", 3);

            // Create StudentManager object
            StudentManager manager = new StudentManager();

            // Add students to the manager
            manager.addStudent(student1);
            manager.addStudent(student2);
            manager.addStudent(student3);

            // Retrieve and display a student by ID
            int idToFind = 2;
            Student foundStudent = manager.getStudentById(idToFind);
            if (foundStudent != null) {
                System.out.println("Student found with ID " + idToFind + ": " + foundStudent.getName());
            } else {
                System.out.println("Student with ID " + idToFind + " not found.");
            }

            // Display all students in the list
            ArrayList<Student> allStudents = manager.getAllStudents();
            System.out.println("All students:");
            for (Student student : allStudents) {
                System.out.println(student.getName() + " (ID: " + student.getId() + ")");
            }

            // Remove a student by ID and display the list of students again
            int idToRemove = 3;
            boolean removed = manager.removeStudentById(idToRemove);
            if (removed) {
                System.out.println("Student with ID " + idToRemove + " removed successfully.");
            } else {
                System.out.println("Student with ID " + idToRemove + " not found. No student removed.");
            }

            // Display all students in the list after removal
            System.out.println("Students after removal:");
            allStudents = manager.getAllStudents();
            for (Student student : allStudents) {
                System.out.println(student.getName() + " (ID: " + student.getId() + ")");
            }
        }
    }


