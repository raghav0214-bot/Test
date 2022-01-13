class calculator
{ 
int add(int a,int b)
{
return a+b;
}
int subtract(int a,int b)
{
return a-b;
}
int multiply(int a, int b)
{
return a*b;
}



}
public class simple
{
public static void main(String[] args)
{
calculator c1=new calculator();
System.out.println(c1.add(4,5));
System.out.println(c1.subtract(6,5));
System.out.println(c1.multiply(6,5));

}
}