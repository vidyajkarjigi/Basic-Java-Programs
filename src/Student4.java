class Student4 {
    private String usn, name;
    private int m1, m2, m3;

    static int count = 0;
    final int MAX_MARKS = 100;

    Student4(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        if (valid(m1) && valid(m2) && valid(m3)) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        } else {
            throw new IllegalArgumentException("Invalid marks");
        }
        count++;
    }

    public String getUSN()
    {
        return usn;
    }
    public String getName() { return name; }
    public int getM1() { return m1; }
    public int getM2() { return m2; }
    public int getM3() { return m3; }

    boolean valid(int m) {
        return m >= 0 && m <= MAX_MARKS;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn + "\nName: " + name);
    }

    void display(boolean result) {
        display();
        System.out.println("Total: " + total());
        System.out.println("Average: " + average());
    }

    Student4 resultSummary() {
        return new Student4(usn, name, m1, m2, m3);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4("101", "Ravi", 80, 90, 85);
        Student4 s2 = new Student4("102", "Anu", 75, 88, 92);

        s1.display();
        s1.display(true);

        Student4 s3 = s1.resultSummary();
        System.out.println("Summary average: " + s3.average());

        System.out.println("Total students: " + count);
    }
}
