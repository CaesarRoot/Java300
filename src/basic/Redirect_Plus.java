package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Redirect_Plus {
	public static void main(String[] args)
	{
		try
		{
			FileInputStream is=new FileInputStream("E:\\Javakingdom\\Demo2£¨300£©\\Chapter3\\Redirect_Plus\\Redirect_Plus.txt");
			System.setIn(is);
			Scanner sc=new Scanner(System.in);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e) {e.printStackTrace();}
	}
}
