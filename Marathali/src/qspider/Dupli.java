package qspider;

public class Dupli {
public static void main(String[] args) {
	String s="java java easy";
	String []s1=s.split(" ");
	 String s2="";
	for(int i=0;i<s1.length;i++) {
		String s3=s1[i];
		
		if(s2.contains(s3)==false) {
			s2+=s3;
			if(i<s1.length-1)
				s2+=" ";
		}
	}
	System.out.println(s2);
	
}
}
