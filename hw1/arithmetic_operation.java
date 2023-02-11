abstract class arithmetic_operation
{
abstract void printInfo();
}
class add extends arithmetic_operation
{
    void printInfo ()
    {
        int a = 3;
        int b= 4;
        System.out.println(a+b);
 
    }
}
class sub extends arithmetic_operation
{
    void printInfo()
    {
        int c=4;
        int d=5;
        System.out.println(c-d);
    }
}
class abstraction
{
    public static void main(String args[])
    {
        arithmetic_operation n = new add();
        n.printInfo();
        arithmetic_operation y = new sub();
        y.printInfo();
    }
}