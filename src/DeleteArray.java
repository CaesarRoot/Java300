import java.util.ArrayList;
import java.util.Iterator;

public class DeleteArray {
    ArrayList<Integer> arrayList;
    public static void main(String[] args){
        DeleteArray deleteArray = new DeleteArray();
        deleteArray.start();
    }

    public void start(){
        arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        Iterator<Integer> ite = arrayList.iterator();
        while(ite.hasNext()){
            if(ite.next()%2 == 0){
                ite.remove();
            }
        }
        for(int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
