package basic;

public class Yanghui {
	public static void main(String[] args)
	{
		int triangle[][]=new int[10][];   //��ά����ÿ��Ԫ�ض���һ��һά���飬���Բ�ָ��һά����ĳ���
		for(int i=0;i<triangle.length;i++)   //��Ϊһά���������������
		{
			triangle[i]=new int[i+1];     //��һά���鶨����
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
