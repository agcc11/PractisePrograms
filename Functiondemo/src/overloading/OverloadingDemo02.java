package overloading;

public class OverloadingDemo02 {
	public void studentInfo()
	{
		System.out.println(" student information is below");
		System.out.println("name.  rollno");
	}
	
	public  void studentInfo(String a[] ,int b[] )
	
/*	rollNo[0]=10;
	rollNo[1]=20;
	rollNo[2]=30;
	rollNo[4]=40;
	*/
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(a[i]+"\t" +b[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"aniket","rutuja","pranali","kunal"};
		int b[]= {10,20,30,40};
		OverloadingDemo02 objj=new OverloadingDemo02();
		objj.studentInfo();
		objj.studentInfo(a,b);
	}

}

