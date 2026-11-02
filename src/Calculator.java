class Calculator
{
    int calculator(int a,int b)
    {
        return a+b;
    }
    double calculator(double a,double b)
    {
        return a*b;
    }
    int calculator(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
            else
            {
                return c;
            }
        }
        if(b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    double calculator(int a,double b)
    {
        return a-b;
    }
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        System.out.println("Sum:"+obj.calculator(20,30));
        System.out.println("Product:"+obj.calculator(5.6,3.6));
        System.out.println("largest:"+obj.calculator(5,6,7));
        System.out.println("Difference:"+obj.calculator(5,2.3));
    }
}
