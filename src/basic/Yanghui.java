package basic;

public class Yanghui {
	public static void main(String[] args)
	{
		int triangle[][]=new int[10][];   //二维数组每个元素都是一个一维数组，可以不指定一维数组的长度
		for(int i=0;i<triangle.length;i++)   //此为一维数组个数，即行数
		{
			triangle[i]=new int[i+1];     //给一维数组定长度
			for(int j=0;j<=i;j++)
			{
				if(i==0||j==0||j==i)
				{
					triangle[i][j]=1;
				}
				else
				{
					triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
		
				}
				System.out.print(triangle[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
