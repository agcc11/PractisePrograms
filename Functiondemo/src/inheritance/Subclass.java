package inheritance;

public class Subclass extends Superclass {
public void bankhdfc()
{
	System.out.println("recived amt from bank 01 to bank02");
}
public static void main(String[] args) {
	Subclass obj=new Subclass();
	obj.banksbi();
	obj.bankhdfc();

}
}
