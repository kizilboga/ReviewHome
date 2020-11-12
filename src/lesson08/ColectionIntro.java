package lesson08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColectionIntro {

	public static void main(String[] args) {
		// TODO Auto-genLÝsterated method stub
		List<String> africa = new ArrayList<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Algeria");
System.out.println(africa);

List<String> africa2= new ArrayList<>(africa);
System.out.println(africa2);

List<String> africa3= new ArrayList<>();
africa3.addAll(africa);
System.out.println("----");
for (String element: africa) {
	System.out.println(element);
}
System.out.println("-----");
for (int i=0; i<africa.size();i++) {
	
	System.out.println(africa.get(i));
}
System.out.println("----");
Iterator<String> it = africa.iterator();
while(it.hasNext()){
	String a = it.next();
	
	System.out.println(a);
}













	}

}
