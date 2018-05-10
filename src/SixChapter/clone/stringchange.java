package SixChapter.clone;

public class stringchange {
	public static void main(String[] args)
	{
		String a="shits";
		a.replace('s','S');
		System.out.println(a);
		String b=a.replace('s','S');
		System.out.println(b);
		int c=100;
		int d=c;
		c=200;
		System.out.println(" c="+c+" d="+d);
	}
}
