package ArraylistDemo;

import java.util.ArrayList;

public class ToArray {
	public ArrayList<Integer> arrayList = new ArrayList<>();
	public Integer[] array;
	
	public static void main(String[] args) {
		ToArray toArray = new ToArray();
		toArray.start();
	}
	
	public void start() {
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		array = arrayList.toArray(new Integer[0]);
//		array = new Integer[arrayList.size()];
//		arrayList.toArray(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
