class University1 {
    String universityName = "VTU";

    // Static nested class
    static class Department {
        String deptName;

        Department(String name) {
            deptName = name;
        }

        void display() {
            System.out.println("Department: " + deptName);
        }
    }

    // Non-static inner class
    class Faculty {
        String facultyName, designation;

        Faculty(String name, String desig) {
            facultyName = name;
            designation = desig;
        }

        void display() {
            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
    }
}

public class University {
    public static void main(String[] args) {
        // Create Department without University object
        University1.Department d =
                new University1.Department("Computer Science");

        // Create University object
        University1 u = new University1();

        // Create Faculty using University object
        University1.Faculty f =
                u.new Faculty("Ravi", "Professor");

        u.displayUniversity();
        d.display();
        f.display();
    }
}