import Anonymous.Test1;

import java.util.*;

public class Test {
    public static void main(String[] args){
        String[] arr = {"a", "a", "c", "d", "d"};
        //ʵ����һ��set����
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        //toArray()�����᷵��һ��������������Ԫ�ص�����
        String[] newArr = set.toArray(new String[0]);
        for(String s:newArr){
            System.out.println(s);
        }
        Test.binaryToDecimal(7);
        Test.toDecimal("00000000000000000000000000000111");
        System.out.println(('7'-'0'));
    }

    public static void binaryToDecimal(int n){
        StringBuilder s = new StringBuilder();
            for(int i = 31;i >= 0; i--) {
                s.append(n >>> i & 1);
            }
            System.out.println(s);
        String s = "sdasf";
        s.matches()
    }

    public static void toDecimal(String s){
        System.out.println(Integer.parseInt(s, 2));
    }
}
