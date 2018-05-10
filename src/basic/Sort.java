package basic;

import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;

import basic.ChooseRandom.KeyPress;

public class Sort {
	JTextArea randomArea;
	JTextArea resultArea;
	
	public static void main(String[] args)
	{
		Sort a=new Sort();
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
		
		randomArea.addKeyListener(new KeyPress());
		JButton resultB=new JButton("排序");
		resultB.addActionListener(new resultListener());
		
		mainPanel.add(randomArea);
		mainPanel.add(rScroller);
		mainPanel.add(resultB);
		
		frame.getContentPane().add(mainPanel);
		frame.setBounds(100,100,400,500);
		frame.setVisible(true);
	}
	
	public class KeyPress implements KeyListener     //键盘事件的监听者
	{
		public void keyPressed(KeyEvent ev) 
		{
			char key=ev.getKeyChar();                //取消非法字符输入有效性
			String mask="0123456789 ";               //或  "0123456789"+(char)8 或 "0123456789"+" "
			if(mask.indexOf(key)==-1)
			{
				ev.consume();
			}
		}
		public void keyReleased(KeyEvent arg0)
		{
			// TODO Auto-generated method stub		
		}

		public void keyTyped(KeyEvent arg0) 
		{
			// TODO Auto-generated method stub	
		}
	}
	
	public class resultListener implements ActionListener
	{
		public void actionPerformed(ActionEvent ev)
		{
			resultArea.setText("");
			String a=randomArea.getText();
			String[] b=a.split(" {1,}");           //以若干空格隔开
			int[] array=new int[b.length];
			for(int i=0;i<b.length;i++)
			{
				array[i]=Integer.parseInt(b[i]);
			}
			Arrays.sort(array);
			for(int value:array)                   //对数组中每个元素执行操作
			{
				resultArea.append(value+" ");
			}
		}
	}
}