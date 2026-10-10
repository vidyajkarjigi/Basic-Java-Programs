class Student
{
    String name;
    int rollno;
    int marks;
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Marks:"+marks);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Vidya";
        s1.rollno=53;
        s1.marks=89;
        Student s2=new Student();
        s2.name="Pradeep";
        s2.rollno=34;
        s2.marks=99;
        s1.display();
        s2.display();
    }
}
