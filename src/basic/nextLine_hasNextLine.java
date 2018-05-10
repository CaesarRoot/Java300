package basic;

import java.util.*;

public class nextLine_hasNextLine {

   public static void main(String[] args) {
	
	   String s="first"+"\n"+"second";
       // create a new scanner with the specified String Object
       Scanner scanner = new Scanner(s);

       // print the next line
       System.out.println(scanner.nextLine());

       // check if there is a next line again
       System.out.println(scanner.hasNextLine());

       // print the next line
       System.out.println(scanner.nextLine());

       // check if there is a next line again
       System.out.println(scanner.hasNextLine());

       // close the scanner
       scanner.close();
	   
   }
}
