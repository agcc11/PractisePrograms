package Array;

import java.util.Arrays;

public class swaparray {

	public static void main(String[] args) {
		// with using third variable
int a[]=new int[3];
a[0]=50;
a[1]=57;
a[2]=58;
  int b;
  b=a[0];
  a[0]=a[2];
  a[2]=b;
System.out.println(Arrays.toString(a));  
  
  

 System.out.println("----------------");
 
 //without using third variable
 int c[]=new int[3];
 c[0]=5;
 c[1]=10;
 c[2]=15;
 c[0]=c[0]+c[1];
 c[1]=c[0]-c[1];
 c[0]=c[0]-c[1];
 System.out.println(Arrays.toString(c));
 
 //reverse array printing
 int d[]= {20,25,11,2,100};
int e;
 e=d[0];
 d[0]=d[4];
 d[4]=e;
   e=d[1];
 d[1]=d[3];
 d[3]=e;
 System.out.println(Arrays.toString(d));
 
 for(int j=4;j>=0;j--)
 {
	 System.out.print(d[j]+" ");
 }
 
 
 
 


 
 
 
 
 




	}

}
