package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add(34);
	arr.add("Shweta");
	arr.add(34.73);
	arr.add(54);
	arr.add(87);
	
	Iterator itr=arr.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
