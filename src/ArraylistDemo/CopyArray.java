package ArraylistDemo;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        CopyArray copyArray = new CopyArray();
        copyArray.start();
    }

    public void start() {
        Integer[] array = {1,2,3,4,5,6};
        Integer[] array2 = Arrays.copyOfRange(array,3, array.length);
        for(int i=0;i<array2.length;i++) {
            System.out.println(array2[i]);
        }
    }
}
