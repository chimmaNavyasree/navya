package interfaces;

interface int1{  
void print();  
}  
interface int3{  
void show();  
}  
class Ass4 implements int1,int3{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	Ass4 obj = new Ass4();  
obj.print();  
obj.show();  
 }  
}  