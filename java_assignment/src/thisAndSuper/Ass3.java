package thisAndSuper;
class x{  
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
this.m();  
}  
}  
class Ass3{  
public static void main(String args[]){  
x a=new x();  
a.n();  
}}  
