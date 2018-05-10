package basic;

import java.awt.event.*;
import javax.swing.*;

public class SelectionSort {
	
	JTextArea randomArea;
	JTextArea resultArea;
	
	public static void main(String[] args)
	{
		SelectionSort a=new SelectionSort();
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
		resultArea.setBorder(BorderFactory.createEtchedBorder());
		resultArea.setLineWrap(true);
		
		JButton randomB=new JButton("生成随机数据");
		randomB.addActionListener(new randomListener());
		JButton resultB=new JButton("选择排序法排序");
		resultB.addActionListener(new resultListener());
		
		mainPanel.add(randomArea);
		mainPanel.add(randomB);
		mainPanel.add(resultArea);
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
		public void actionPerformed(ActionEvent ev)
		{
			resultArea.setText("");
			String a=randomArea.getText();
			String[] b=a.split(" ");
			int[] array=new int[b.length];
			for(int i=0;i<b.length;i++)
			{
				array[i]=Integer.parseInt(b[i]);
			}
			
			int index;
			for(int i=1;i<array.length;i++)   //n个数做n-1次
			{
				index=0;                      
				for(int j=1;j<=array.length-i;j++)   //比较未排序的每一个数，找出最大者
				{
					if(array[j]>array[index])      //遇到大的数记录下序号
						index=j;
				}
				int temp=array[array.length-i];    //交换最大的数和没排序的最后一个数
				array[array.length-i]=array[index];
				array[index]=temp;
			}
			
			for(int i=0;i<array.length;i++)
			{
				resultArea.append(array[i]+" ");
			}
		}
	}
}
