package casting;

public class PrimitiveCasting {
	
	
	

	public static void main(String[] args) {
		
         int a=10;                           ///implicit casting 
         double b;
         b=a;
         
         System.out.println(a);
         System.out.println(b);
         
         
         System.out.println("------------------------------------------");
	
         
         double c=20;                               //explicit casting 
         int d;
         d=(int) c;
  
         System.out.println(d);
         System.out.println(c);
         
         System.out.println("----------------------------------------------------");
         
         byte e=100;
         short s;
         s=e;
         System.out.println(s);
         
         int t=400;
         long g;
         g=t;
         System.out.println(t);
         
         
         float n=14.54f;
         double u;
         u=n;
         System.out.println(u);
         
         short f=145;
         int h;
         h=f;
         
       System.out.println(f);  
       
       double q=1011.454;
       float w;
       w=(float) q;
       System.out.println(w);
      
       
       
         
         
	}
	
}
