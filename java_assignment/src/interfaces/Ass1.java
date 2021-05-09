package interfaces;

interface printable{  
void print();  
}  
class Ass1 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
	Ass1 obj = new Ass1();  
    obj.print();  
 }  
}  