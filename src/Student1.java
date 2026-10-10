 class Student1
{
    int id;
    String name;
    int age;
    String branch;
    double marks;
    Student1(int id ,String name,int age,String branch,double marks)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.marks=marks;

    }
    void display()
    {
        System.out.println(id+"   "  +name+"  "  +"  " +age+"  "  +branch+"  " +marks);
    }
    public static void main(String[] args)
    {
        Student1[] students =new Student1[100];
        students[0]=new Student1(101,"Rahul",20,"CSE",85.5);
        students[1]=new Student1(102,"Priya",19,"ISE",91.5);
        students[2] =new Student1(103,"Anu",20,"ECE",75);
        students[0].display();
        students[1].display();
        students[2].display();
    }
}
