class Demo
{
public static void main(String args[])
{
for(int i=1;i<=10;i++)
{
if(i%2==0)
{
factorial(i);
}
}
}
static void factorial(int no)
{
int fact=1;
for(int i=no;i>=1;i--)
{
fact=fact*i;
}
System.out.println(fact);
}
}