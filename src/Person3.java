class Person4 {
    private String name;
    private int age;

    static int count = 0;
    static final String COLLEGE = "CIT";

    Person4(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method
    void displayDetails(String role) {
        System.out.println("Role: " + role);
        displayDetails();
    }

    // Nested class
    static class Department {
        private String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void display() {
            System.out.println("Department: " + deptName);
        }
    }
}

class Student6 extends Person4 {
    private int usn;
    private String course;

    Student6(String name, int age, int usn, String course) {
        super(name, age);
        this.usn = usn;
        this.course = course;
    }

    @Override
    void displayDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person4 {
    private String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person4 {
    private String designation;

    Administrator(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Designation: " + designation);
    }
}

public class Person3 {
    public static void main(String[] args) {
        Person4[] p = {
                new Student6("Ravi", 20, 101, "CSE"),
                new Faculty("Anu", 35, "Java"),
                new Administrator("Raj", 40, "Manager")
        };

        for (Person4 x : p) {
            x.displayDetails();
            System.out.println();
        }

        Person4 obj = new Person4("Kiran", 25);
        obj.displayDetails("Guest");

        Person4.Department d =
                new Person4.Department("Computer Science");
        d.display();

        System.out.println("College: " + Person4.COLLEGE);
        System.out.println("Total People: " + Person4.count);
    }
}
