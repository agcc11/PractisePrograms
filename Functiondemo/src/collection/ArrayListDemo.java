package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declartion
	//	ArrayList al=new ArrayList();    //hetrogeneous
	//	ArrayList<String>all=new ArrayList<String>();
	//	ArrayList<Integer>all=new ArrayList<Integer>();
	//	List al=new ArrayList();         //upcasting
		
		ArrayList al=new ArrayList();  
		al.add(100);
		al.add("hello");
		al.add(15.5);
		al.add(true);
		System.out.println(al);
		int sizz=al.size();
		System.out.println(sizz);
		
		//add element in between
		al.add(1,200);
		System.out.println(al);
		
		//add elemnt in lat position
		al.add("world");
		System.out.println(al);
		
		
		//remove method
		al.remove(2);    //index
		System.out.println(al);
		
		al.remove(15.5);    //object
		System.out.println(al);
		
		
		//retreive element 
		
		System.out.println(al.get(2));
		
		//replace element using set method
		al.set(3,"pune");
		System.out.println(al);
		
		
		
	   //Reading all element
		
		//for loop
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		//for..each loop
		
		System.out.println("for each loop");
		
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		//Iterator
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		// adding one arraylist element in new arraylist
		
		ArrayList ad=new ArrayList();
		ad.add("x");
		ad.add("y");
		ad.add("z");
		ad.add("a");
		ad.add("b");
		ad.add("c");
		
		ArrayList as=new ArrayList();
		as.addAll(ad);
		System.out.println(as);
		
		//sorting array
		Collections.sort(as);
		System.out.println(as);
		
		//sorting in reverse order
		Collections.sort(as,Collections.reverseOrder());
		System.out.println(as);
		
		//shuffling method
		
		Collections.shuffle(as);
		System.out.println(as);
		}
		
		
		
		
		
		
		

	}


