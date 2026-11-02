class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        System.out.println("Person constructor");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee2 extends Person1 {
    int id;
    double basicSalary;

    Employee2(String name, int age, int id, double salary) {
        super(name, age);
        System.out.println("Employee constructor");
        this.id = id;
        basicSalary = salary;
    }

    void display() {
        super.display();
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee2 {
    String department;
    double bonus;

    Manager(String name, int age, int id, double salary,
            String department, double bonus) {
        super(name, age, id, salary);
        System.out.println("Manager constructor");
        this.department = department;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Person {
    public static void main(String[] args) {
        Manager m = new Manager(
                "Ravi", 35, 101, 50000, "IT", 10000
        );

        System.out.println("\nManager Details:");
        m.display();
    }
}
