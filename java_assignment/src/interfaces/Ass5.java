package interfaces;

interface Prt{  
void print();  
}  
interface Shw{  
void print();  
}    
class Ass5 implements Prt, Shw{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
	Ass5 obj = new Ass5();  
  obj.print();  
 }  
}  
