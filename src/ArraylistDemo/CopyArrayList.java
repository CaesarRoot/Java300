package ArraylistDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopyArrayList {
	public ArrayList<Integer> arrayList = new ArrayList<>();
	public ArrayList<Integer> arrayList2;
	
	public static void main(String[] args) {
		CopyArrayList toArray = new CopyArrayList();
		toArray.start();
	}
	
	public void start() {
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
//		arrayList2 = new ArrayList<>(arrayList);
		arrayList2 = new ArrayList<>(Arrays.asList(new Integer[arrayList.size()]));
		Collections.copy(arrayList2, arrayList);
		for(int i=0;i<arrayList2.size();i++) {
			System.out.println(arrayList2.get(i));
		}
	}

}
