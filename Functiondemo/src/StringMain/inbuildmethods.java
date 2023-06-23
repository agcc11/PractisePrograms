package StringMain;

public class inbuildmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="velocity is training centre";
String b= "velocity is training CENTRE";
String c="    velocity";
System.out.println(a.length());
System.out.println(c.length());
System.out.println(a.charAt(9));
System.out.println(a.toUpperCase());
System.out.println(b.toLowerCase());
System.out.println(a.equals(b));
System.out.println(a.indexOf('c'));
System.out.println(a.lastIndexOf('c'));
System.out.println(b.isEmpty());
System.out.println(a.replace('i', 'x'));
System.out.println(c);
System.out.println(c.trim());
System.out.println(c.concat(" is class"));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.substring(4, 7));
System.out.println(a.startsWith("velocity"));
System.out.println(b.endsWith("CENTRE"));
	
}
}
