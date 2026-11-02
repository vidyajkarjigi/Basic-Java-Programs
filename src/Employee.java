class Employee1 {
    int id;
    String name;
    double basicSalary;

    Employee1(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee1 {
    double allowance, bonus;

    PermanentEmployee(int id, String name, double basicSalary,
                      double allowance, double bonus) {
        super(id, name, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee1 {
    int hours;
    double rate;

    ContractEmployee(int id, String name, double basicSalary,
                     int hours, double rate) {
        super(id, name, basicSalary);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee1[] e = {
                new PermanentEmployee(101, "Ravi", 30000, 5000, 2000),
                new ContractEmployee(102, "Anu", 0, 160, 200)
        };

        for (Employee1 emp : e) {
            emp.display();
            System.out.println();
        }
    }
}
