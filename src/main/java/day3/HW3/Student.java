package day3.HW3;


    public class Student extends Person implements compareById {
        private int studentId;
        private String course;


        public Student(String name, int age, String address, int studentId, String course) {
            super(name, age, address);
            setStudentId(studentId);
            setCourse(course);
        }


        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            if (studentId <= 0) {
                throw new IllegalArgumentException("Student ID must be a positive integer.");
            }
            this.studentId = studentId;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        @Override
        public boolean compareById(int id) {
            return this.studentId == id;
        }

        @Override
        public String toString() {
            return super.toString() + ", Student ID: " + studentId + ", Course: " + course;
        }
    }

