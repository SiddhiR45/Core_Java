package String;

public class String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="java is a programming language";
		char c[]= {'a','b','c'};
		String s4=new String(c);
		byte b[]= {101,102,103,104};
		String s3=new String(b);
		StringBuffer sb=new StringBuffer("Java");
		String s2=new String(sb);
		StringBuilder sb1=new StringBuilder("Python");
		String s1=new String(sb1);
		String s=new String("java is a programming language");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.concat("object"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("h"));
		System.out.println(s.lastIndexOf("g"));
		System.out.println(s.equals(sb1));
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.compareTo(s));
		System.out.println(s.hashCode());
		System.out.println(s.replace('a','j'));
		
		//immutable
		//storage:-heap memory,scp
		//synchronized
		//thread safe
		//use when string content does not frequently changed
		//eg:-username , email, gender
		String s7="java";
		s.concat("programming");
		System.out.println(s);
		
		
		//mutable
		//Storage:-heap memory
		//synchronized
		//thread safe
		//default capacity of string buffer is 16
		//final capacity=default capacity+length of string
		//use when string content get frequently changed
		//eg:-notepad, word
		StringBuffer sb4=new StringBuffer("java programming");
		StringBuffer sb5=new StringBuffer("java programming");
		//sb.append(" programming");
		System.out.println(sb4.capacity());
		System.out.println(sb4.length());
		System.out.println(sb4);
		System.out.println(sb4.reverse());
		System.out.println(sb4);
		System.out.println(sb5);
		System.out.println(sb4.compareTo(sb5));
		System.out.println(sb4.insert(0, "p"));
		System.out.println(sb4.replace(2, 6, "pstr"));
		System.out.println(sb4);
		
		
		//storage:-heap
		//mutable
		//non-synchronized
		//non thread safe
		//best performance
		StringBuilder sb7=new StringBuilder("java");
		System.out.println(sb7);
		System.out.println(sb7.capacity());
		System.out.println(sb7.reverse());
		
		//use of intern class
		String str="java";
		String str1=new String("java");
		String str2=str1.intern();
		System.out.println(str==str2);
		
		//why char array is prefferd over string for storing password
		//1 reason
		String str3="java123";
		System.out.println(str3);
		char p[]= {'j','a','v','a','1','2','3','4'};
		int x[]= {1,2,3,4,5};
		System.out.println(p);
		System.out.println(x);
		
	}

}
