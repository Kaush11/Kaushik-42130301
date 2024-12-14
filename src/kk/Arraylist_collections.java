package kk;
import java.util.*;


public class Arraylist_collections {

	public static void main(String[] args) {
		
		
		
		ArrayList arr=new ArrayList<>();
		
		arr.add(21);
		arr.add("kaush");
		arr.add(19);
		arr.set(1,"good");
		System.out.println(" "+arr);
		System.out.println(arr.get(1));
		
		ArrayList<ArrayList> q=new ArrayList<>();
		for (int i=0;i<3;i++) {
			q.add(new ArrayList());
		}
		q.get(0).add(20);
		q.get(1).add("is");
		q.get(2).add("beautifu");
	//	q.get(3).add("if");
	//	q.get(4).add("you");
		
		System.out.println(q);
		System.out.println(q.get(2));
		
		
		HashSet h=new HashSet<>();
		
		h.add(1);
		h.add(20);
		h.add("kaush");
		h.add("gets");
		h.add(20);
		
		System.out.println(h);
		
		
		//ararages in asencing order and removes duplicates only for integers
		
		TreeSet t=new TreeSet<>();
		
		
		t.add(1);
		t.add(15);
		t.add(20);
		t.add(4);
		t.add(2);
		t.add(2);
		
		
		System.out.println(t);
		
		
		//queue implementation using collections
		Queue q1=new LinkedList<>();
		
		q1.add(1);
		q1.add(15);
		q1.add(20);
		q1.add(4);
		q1.add(2);
		q1.add(2);
		
		Iterator itr=q1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		
		

	}

}
