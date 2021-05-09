package thisAndSuper;
class eat{  
void eat(){System.out.println("eating...");}  
}  
class D extends eat{   
void work(){  
super.eat();    
}  
}  
class Ass5{  
public static void main(String args[]){  
D d=new D();  
d.work();  
}}  
