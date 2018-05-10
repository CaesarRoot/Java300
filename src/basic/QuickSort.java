package basic;

import java.awt.event.*;
import java.lang.reflect.Array;

import javax.swing.*;


public class QuickSort {
	JTextArea randomArea;
	JTextArea resultArea;
	
	public static void main(String[] args)
	{
		QuickSort a=new QuickSort();
		a.go();
	}
	
	public void go()
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));
		
		randomArea=new JTextArea(20,5);
		randomArea.setBorder(BorderFactory.createEtchedBorder());
		randomArea.setLineWrap(true);
		resultArea=new JTextArea(20,5);
		resultArea.setBorder(BorderFactory.createEtchedBorder());       //加了滚动条，设置textfield样式仍然对界面有影响
		resultArea.setLineWrap(true);
		JScrollPane rScroller=new JScrollPane(resultArea);
		rScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		rScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton randomB=new JButton("生成随机数据");
		randomB.addActionListener(new randomListener());
		JButton resultB=new JButton("快速排序法排序");
		resultB.addActionListener(new resultListener());
		
		mainPanel.add(randomArea);
		mainPanel.add(randomB);
		mainPanel.add(rScroller);
		mainPanel.add(resultB);
		
		frame.getContentPane().add(mainPanel);
		frame.setBounds(100,100,400,500);
		frame.setVisible(true);
	}
	
	public class randomListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			randomArea.setText("");
			int a;
			for(int i=0;i<10;i++)
			{
				a=(int)(Math.random()*50);
				randomArea.append(a+" ");
			}
		}
	}
	
	public class resultListener implements ActionListener
	{
		int[] array;
		public void actionPerformed(ActionEvent ev)
		{
			resultArea.setText("");
			String a=randomArea.getText();
			String[] b=a.split(" ");
			array=new int[b.length];
			for(int i=0;i<b.length;i++)
			{
				array[i]=Integer.parseInt(b[i]);
			}
			quickSort(array,0,array.length-1);       //调用排序方法
		}
	   public void quickSort(int sortarray[],int lowIndex,int highIndex)
		{	
			int lo=lowIndex;
			int hi=highIndex;
			int key=sortarray[lowIndex];
			if(highIndex>lowIndex)
			{
				while(lo<hi)
				{
					while((hi>lo)&&(sortarray[hi]>=key))    //顺序很重要，先从右边找
						hi--;
					while((lo<hi)&&(sortarray[lo]<=key))  
						lo++;
					if(lo<hi)
					{
						swap(sortarray,lo,hi);
					}
				}
				swap(sortarray,lowIndex,hi);               //基准数归位
				if(hi-1>lowIndex)
					quickSort(sortarray,lowIndex,hi-1);
				if(lo+1<highIndex)
					quickSort(sortarray,lo+1,highIndex);
			}
		}
	   private void swap(int swapArray[],int i,int j)
	   {
		   int temp=swapArray[i];
		   swapArray[i]=swapArray[j];
		   swapArray[j]=temp;
		   for(int k=0;k<array.length;k++)
		    {
			    resultArea.append(array[k]+" ");
		    }
			resultArea.append("\n");
	   }
	}
}
