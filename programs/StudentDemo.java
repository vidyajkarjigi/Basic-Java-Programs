import java.util.Scanner;

class Student5{
    String USN, Name, Branch;
    long Phone;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Branch: ");
        Branch = sc.nextLine();

        System.out.print("Enter Phone: ");
        Phone = sc.nextLong();
        sc.nextLine();
    }

    void displayDetails() {
        System.out.printf("%-15s %-15s %-15s %-15d%n",
                USN, Name, Branch, Phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student5 s[]=new  Student5[n];

        // Create N student objects
        for (int i = 0; i < n; i++) {
            s[i] = new Student5();
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i].getDetails();
        }

        // Display student details
        System.out.println("\n----------- STUDENT DETAILS -----------");
        System.out.printf("%-15s %-15s %-15s %-15s%n",
                "USN", "NAME", "BRANCH", "PHONE");

        for (int i = 0; i < n; i++) {
            s[i].displayDetails();
        }

        sc.close();
    }
}