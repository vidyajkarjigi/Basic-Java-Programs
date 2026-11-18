class Student2
{
   String name;
   int age;
   //Constructor 1
    Student2()
    {
       name="Unknown";
       age=0;
    }
    //Constructor 2
    Student2(String n)
    {
        name=n;
        age=0;
    }
    //Constructor 3
    Student2(String n,int a)
    {
        name=n;
        age=a;
    }
    public static void main(String[] args)
    {
        Student2 s1=new Student2();
        Student2 s2=new Student2("Rahul");
        Student2 s3=new Student2("Priya",21);
    }
}
