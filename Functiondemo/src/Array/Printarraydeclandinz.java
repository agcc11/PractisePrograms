package Array;

import java.util.Arrays;

public class Printarraydeclandinz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a[]= {10,20,30};
System.out.println(a[1]);
*/	

	
	int rdx[][]= {{5,6,7},{1,2,3}};
	for(int i=rdx.length-1;i>=0;i--)
	{
		for(int j=rdx[i].length-1;j>=0;j--)
		{
			System.out.print(" "+rdx[i][j]);
			
		}
		System.out.println();
	}
	
	
	}

	
	}


