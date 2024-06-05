package day3.HW3;

    public abstract class Person extends PersonRecord {
        private String name;
        private int age;
        private String address;

        // Constructor
        public Person(String name, int age, String address) {
            setName(name);
            setAge(age);
            setAddress(address);
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Age must be between 0 and 150.");
            }
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String getDetails() {
            return toString();
        }

        public abstract boolean compareById(int id);

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Address: " + address;
        }
    }

