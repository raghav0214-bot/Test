class calculator
{ 
void add(int a,int b)
{
return a+b;
}
void subtract(int a,int b)
{
return a-b;
}

}
public class simple
{
public static void main(String[] args)
{
calculator c1=new calculator();
System.out.println(c1.add(4,5));
System.out.println(c1.subtract(6,5));

}
}