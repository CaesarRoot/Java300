package SixChapter;

public class HanoiTower {
	public static void moveDish(int level,char start,char middle,char end)
	{
		if(level==1)
		{
			System.out.println(start+"-->"+end);
		}
		else
		{
			moveDish(level-1,start,end,middle);
			System.out.println(start+"-->"+end);
			moveDish(level-1,middle,start,end);
		}
	}
	
	
	public static void main(String[] args)
	{
		int level=3;
		moveDish(level,'A','B','C');
	}
}
