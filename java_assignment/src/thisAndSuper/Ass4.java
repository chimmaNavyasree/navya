package thisAndSuper;

class y{  
y(){System.out.println("hello a");}  
y(int x){  
this();  
System.out.println(x);  
}  
}  
class Ass4{  
public static void main(String args[]){  
y a=new y(10);  
}}  
