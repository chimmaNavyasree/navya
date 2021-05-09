package string;

public class MethodOfString {

	public static void main(String[] args) {
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";
		System.out.println("equalsIgnoreCase");
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
		System.out.println("startsWith");
		String s="java string split method by javatpoint";  
		System.out.println(s.startsWith("ja"));  
		System.out.println(s.startsWith("java string")); 
		System.out.println("EndsWith");
		String str="java by javatpoint";  
		System.out.println(str.endsWith("t"));  
		System.out.println(str.endsWith("point"));
		System.out.println("CompareTo");
		String str1="hello";  
		String str2="";  
		String str3="me";  
		System.out.println(str1.compareTo(str2));  
		System.out.println(str2.compareTo(str3)); 
		
	}

}
