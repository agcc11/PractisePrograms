package Stringpractise;

public class countofrepeatwords {

	public static void main(String[] args) {
/*String a="java is programing langauage";

int b=a.length();             //length of String
String c=a.replace("a", "");	//replace a with " "
int d=c.length();              //length of after replacing
int e=b-d;							//
System.out.println(e);	*/		//result how many time a is repeated
		
		
		
		String a[]= {"java","python","c++","c","python"};
		for(int i=0;i<=a.length;i++)	
			{
				for(int j=i+1;j<a.length;j++)
				{
					if((a[i]==a[j])  &&  (i!=j))
					{
						System.out.println("Repeated word is"+a[i]);
					}
					else
					{
						System.out.println("No match found");
					}
				}
				
				
			
		
	}

}
}



