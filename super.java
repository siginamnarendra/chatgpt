import java.util.*;
class A
{
    static Scanner sc=new Scanner(System.in);
    String a=sc.next();
    A()
    {
        System.out.println("A's Def constructor "+a);
        
    }
    A(String b)
    {
        System.out.println("A's single parametered constructor");
    }
    void m1(String a)
    {
        this.a=a;
        System.out.println("A's m1 method");
        
    }
    void m2()
    {
		String d=sc.next();
        System.out.println("A's m2 method");
        this.m1(d);
    }
}
class B extends A
{
    String a=sc.next();
    B()
    {
        super();
        System.out.println("A's Def constructor");
        super.a=this.a;
    }
    B(String b)
    {
        System.out.println("B's single parametered constructor");
    }
    void m1()
    {
         System.out.println("B's m1 method");
         super.m2();
         this.m2();
    }
    void m2()
    {
        System.out.println("B's m2 method");
    }
    public static void main (String[] args) {
	A a=new A();
        B b=new B();
    }
}