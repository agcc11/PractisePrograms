package selenium;

import org.testng.annotations.Test;

public class Group_Concept {

	
	@Test(groups="regression")
	public void test01()
	{
		System.out.println("test01");
	}
	
	@Test(groups={"regression","sanity"})   //	TWO GROUPS IN SINGLE TEST
	public void test02()
	{
		System.out.println("test02");
	}
	
	@Test(groups="sanity")
	public void test03()
	{
		System.out.println("test03");
	}
	
	@Test(groups="uat")
	public void test04()
	{
		System.out.println("test04");
	}
	
		
	
}
