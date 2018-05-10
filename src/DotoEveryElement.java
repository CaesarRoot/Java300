

import java.util.ArrayList;
import java.util.Iterator;

public class DotoEveryElement {
    ArrayList<Integer> arrayList;
    public static void main(String[] args){
        DotoEveryElement dotoEveryElement = new DotoEveryElement();
        dotoEveryElement.start();
    }

    public void start() {
        arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        Iterator<Integer> iterator = arrayList.iterator();
        iterator.forEachRemaining(this::addone);
        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    public void addone(Integer x){
        x = null;
    }
}
