
public class A {
	
	//Method overriding is called will be based on type of the object being referred to at the time of call occurrs.
	//At runtime, it depends upon the type of the object being referred to (not the type of reference variable) that determines
	//which version of an overriden method will be executed
	void m1(){
		System.out.println("Inside A m1 method");
		}
}

 class B extends  A{
	 void m1(){
		 System.out.println("Inside B m1 method");
	 }
 }
 
 class C extends A{
	 void m1(){
		 System.out.println("Inside C m1 method");
	 }
 }
 class Dispatch{
	 public static void main(String[] args) {
		// object of type A
		 A a = new A();
		// object of type B
		B b = new B();
		b.m1();
		// object of type C
		C c = new C();
		
		//Obtain a reference of type A
		A ref;
		
		// ref refers to an A object
        ref = a;
        // calling A's version of m1()
        ref.m1();
 
        // now ref refers to a B object
        ref = b;
 
        // calling B's version of m1()
        ref.m1();
 
        // now ref refers to a C object
        ref = c;
 
        // calling C's version of m1()
        ref.m1();
	}
 }