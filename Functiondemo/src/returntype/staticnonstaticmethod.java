package returntype;

public class staticnonstaticmethod {
static void staticmethod()
{
	System.out.println("static method");
}
 int  nonstaticmethod(int a,int b)
{
      int c;
      c=a+b;
    return c;
     


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticnonstaticmethod diff=new staticnonstaticmethod();
		 int d= diff.nonstaticmethod(10,20);
			System.out.println(d);
	}
	

}
