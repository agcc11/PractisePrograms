package Stringpractise;

public class LongestWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="fun&!! time";
		  String words[]= s.replaceAll("[^a-zA-Z]"," ").split("\\s+");
		  
		  for(int i=0;i<words.length;i++)
		  {
			  System.out.println(words[i]);
		  }
		  String longestword="";

		  for(String word: words)
		  {
		    if(word.length()>longestword.length())
		    {
		      longestword=word;
		    }
		  }
		  System.out.println(longestword);

	}

}
