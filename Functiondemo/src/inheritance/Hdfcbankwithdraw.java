package inheritance;

public class Hdfcbankwithdraw extends Hdfcbank {
public void amtwithdraw()
{
	System.out.println("amt withdraw from hdfcbank");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfcbankwithdraw objj=new Hdfcbankwithdraw();
		objj.amtdeposite();
		objj.amtreceive();
		objj.amtwithdraw();
	}

}
