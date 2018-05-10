package basic;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ChooseRandom {
	
	JFrame frame;
	JTextField nameField;
	JTextArea resultArea;
	JTextArea personnelArea;
	JButton button;
	
	public static void main(String[] args)
	{
		ChooseRandom demo=new ChooseRandom();
		demo.go();
	}
	
	public void go()
	{
		frame=new JFrame("随机抽取幸运观众");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel background=new JPanel();
		
		nameField=new JTextField(10);                //单行
		nameField.addKeyListener(new KeyPress());   //注册键盘监听者
		                                             //更多注册事件可见Demo1 Layout
		personnelArea=new JTextArea(9,8);
		personnelArea.setLineWrap(true);
		personnelArea.setWrapStyleWord(true);
		JScrollPane pScroller=new JScrollPane(personnelArea);
		pScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		resultArea=new JTextArea(10,10);
		resultArea.setLineWrap(true);
		resultArea.setWrapStyleWord(true);
		
		button=new JButton("抽取");
		button.addActionListener(new choose());
		
		JLabel qLabel=new JLabel("输入在场观众姓名并回车");
		JLabel rLabel=new JLabel("抽奖结果");
		
		JPanel leftPanel=new JPanel();
		leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
		leftPanel.add(qLabel);
		leftPanel.add(nameField);
		leftPanel.add(pScroller);
		
		JPanel rightPanel=new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));
		rightPanel.add(rLabel);
		rightPanel.add(resultArea);
		
		background.add(BorderLayout.WEST,leftPanel);
		background.add(BorderLayout.CENTER,rightPanel);
		background.add(BorderLayout.EAST,button);
		
		frame.getContentPane().add(BorderLayout.CENTER,background);
		frame.setSize(450, 300);
		frame.setVisible(true);
	}
	public class KeyPress implements KeyListener     //键盘事件的监听者
	{
		public void keyPressed(KeyEvent ev) 
		{	
			if(ev.getKeyChar()!='\n')
			{
				return;
			}
			String name=nameField.getText();
			if(name.isEmpty())
				return;
			personnelArea.append(name+"\n");
			nameField.setText("");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
		
	public class choose implements ActionListener
	{
		public void actionPerformed(ActionEvent ev) 
		{
			String perstring=personnelArea.getText();
			String[] personnelArray=perstring.split("\n{1,}");
			int index=(int)(Math.random()*personnelArray.length);
			String result=new String("幸运观众为"+personnelArray[index]);
			resultArea.setText(result);
		}
	}
}

