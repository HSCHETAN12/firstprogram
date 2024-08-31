class Sample
{
 static void a1()
{
int a=20;
int b=25;
if(a<=b)
{
System.out.println("hi");
}
}
static void a2()
{
int a=20;
int b=25;
if((a!=b)&& (a<b))
{
System.out.println("hello");
}
}

static void a3()
{
int a=20;
int b=(20+a);
if(((a==b)||(b==a))&&((a!=b)||(b!=a)))
{
System.out.println("bye");
}
else
{
System.out.println("tata");
}
}

static void a4()
{
int x=20;
int y=(x+x)+20;
if(((x>y)||(y>x))&&(((x+20)==y)||((y-20)!=x)))
{
System.out.println("hengenavv");
}
else
{
System.out.println("yakannaaa");
}
}

static void a5()
{
int x=20;
int y=30;
if(x<y)
{
System.out.println("hi");
}
else
{
System.out.println("bye");
}
}

static void a6()
{
int x=10;
int y=((x+10)*0)+10;
if(true)
{
System.out.println("hengenaavvvuu");
}
else
{
System.out.println("mini mini powder");
}
}

static void a7()
{
int x=20;
int y=30;
if(!false)
{
System.out.println("super nivuuu");
}
else
{
System.out.println("mini mini powder");
}
}

public static void main(String args[])
{
a1();
System.out.println("the result of a1");
a2();
System.out.println("the result of a2");
a3();
System.out.println("the result of a3");
a4();
System.out.println("the result of a4");
a5();
System.out.println("the result of a5");
a6();
System.out.println("the result of a6");
a7();
}
}