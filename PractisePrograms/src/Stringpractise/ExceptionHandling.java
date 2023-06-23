package Stringpractise;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//ArrayIndexOutOfBoundsException
		int a[]=new int[5];	
		try
		{
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block is excuted");
		}
		
		
		
		//Arithmatic Exception
		
		double aa=10;
		double b=0;
		double c;
		
		
		c=aa/b;
		System.out.println(c);
		try
		{
			c=aa/b;
		}
		catch(Exception ee)
		{	b=5;
				c=aa/b;
				System.out.println(c);
			System.out.println(ee);
		}
		
		
		
		//Null point Exception
		
		String s=null;
		try
		{
			System.out.println(s.length());	
		}
		catch(Exception eee)
		{
			System.out.println(eee.getMessage());
		}
		
		//number format exception
		
		String sss="aniket123";
		try
		{
		int i=Integer.parseInt(sss);
		}
		catch(Exception sa)
		{
			System.out.println(sa);
		}
		
		//checked exception  handled by throws keyword
		System.out.println("aniket ");
		System.out.println("afar");
			Thread.sleep(3000);
			System.out.println("afarh");
			
			
			
			
	
			
	}

}
