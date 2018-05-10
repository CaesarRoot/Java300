package ArraylistDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        CollectionsDemo collectionsDemo = new CollectionsDemo();
        collectionsDemo.start();
    }

    public void start() {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        System.out.println(Collections.min(arraylist));
        System.out.println(Collections.max(arraylist));
        Collections.sort(arraylist);
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        Collections.sort(arraylist, this::compare);
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
        Collections.reverse(arraylist);
        for(int i=0;i<arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }
    }

    public int compare(Integer a, Integer b){
        return -a.compareTo(b);
    }
}
