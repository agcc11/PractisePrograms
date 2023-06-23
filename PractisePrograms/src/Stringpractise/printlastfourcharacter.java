package Stringpractise;

public class printlastfourcharacter {

	public static void main(String[] args) {
		
		
		String str="www.erostub.com";
		String firstfour=str.substring(0, 4);
		System.out.println(firstfour);
		
		String lastfour=str.substring(str.length()-4,str.length());
		System.out.println(lastfour);
		
		String middle=str.substring(4, str.length()-4);
		System.out.println(middle);
			

	}

}
