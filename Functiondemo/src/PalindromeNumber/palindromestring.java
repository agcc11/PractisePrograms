package PalindromeNumber;

import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
String s;
 s= sc.nextLine();
 int i,j,k;
 i=0;
 j=s.length()-1;
 k=0;
 while(i<j && k==0)
 {
	 if(s.charAt(i)!=s.charAt(j))
	 {
		 k=1;
	 }
	 i++;							
	 j--; 
 }
 if(k==0)
 {
	 System.out.println("palindrome");
 }
 else
 {
	 System.out.println("not palindrome");
 }

 
 
 

	}
	
	}

