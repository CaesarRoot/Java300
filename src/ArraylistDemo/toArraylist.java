package ArraylistDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class toArraylist {
	
	public static void main(String[] args) {
		toArraylist toArraylist = new toArraylist();
		toArraylist.start();
	}
	
	public void start() {
		Integer[] array = {1,2,3,4,5,6};
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}

}
