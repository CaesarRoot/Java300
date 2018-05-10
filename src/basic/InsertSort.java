package basic;

import java.awt.event.*;
import javax.swing.*;

public class InsertSort {
	JTextArea randomArea;
	JTextArea resultArea;
	
	public static void main(String[] args)
	{
		InsertSort a=new InsertSort();
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
		JButton resultB=new JButton("插入排序法排序");
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
			
			int temp;
			int j;
			for(int i=1;i<array.length;i++)    //第0个不用排序
			{
				temp=array[i];
				for(j=i-1;j>=0&&array[j]>temp;j--)
				{
					array[j+1]=array[j];
				}
				array[j+1]=temp;
				                               //显示代码
				for(j=0;j<=i;j++)
				{
					resultArea.append(array[j]+" ");
				}
				resultArea.append(" ][ ");
				for(j=i+1;j<array.length;j++)
				{
					resultArea.append(array[j]+" ");
				}
				resultArea.append("\n");
			}
		}
	}
}
