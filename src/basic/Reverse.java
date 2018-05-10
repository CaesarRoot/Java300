package basic;

import java.awt.event.*;
import javax.swing.*;

public class Reverse {
	JTextArea randomArea;
	JTextArea resultArea;
	
	public static void main(String[] args)
	{
		Reverse a=new Reverse();
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
		resultArea.setBorder(BorderFactory.createEtchedBorder());       //���˹�����������textfield��ʽ��Ȼ�Խ�����Ӱ��
		resultArea.setLineWrap(true);
		JScrollPane rScroller=new JScrollPane(resultArea);
		rScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		rScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		randomArea.addKeyListener(new KeyPress());
		JButton resultB=new JButton("��ת����Ԫ��");
		resultB.addActionListener(new resultListener());
		
		mainPanel.add(randomArea);
		mainPanel.add(rScroller);
		mainPanel.add(resultB);
		
		frame.getContentPane().add(mainPanel);
		frame.setBounds(100,100,400,500);
		frame.setVisible(true);
	}
	
	public class KeyPress implements KeyListener     //�����¼��ļ�����
	{
		public void keyPressed(KeyEvent ev) 
		{
			char key=ev.getKeyChar();                //ȡ���Ƿ��ַ�������Ч��
			String mask="0123456789 ";               //��  "0123456789"+(char)8 �� "0123456789"+" "
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
			String[] b=a.split(" {1,}");           //�����ɿո����
			int[] array=new int[b.length];
			for(int i=0;i<b.length;i++)
			{
				array[i]=Integer.parseInt(b[i]);
			}
			for(int i=0;i<array.length/2;i++)
			{
				int temp=array[i];
				array[i]=array[array.length-1-i];
				array[array.length-1-i]=temp;
			}
			for(int value:array)
			{
				resultArea.append(value+" ");
			}
		}
	}
}
