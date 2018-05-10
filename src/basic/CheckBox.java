package basic;

import java.awt.*;
import javax.swing.*;

public class CheckBox {
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 400, 480);
		
		JPanel mainPanel=new JPanel();
		
		CheckBox a=new CheckBox();
		mainPanel=a.getPanel();
		
		frame.getContentPane().add(mainPanel);
		frame.setVisible(true);
	}
	public JPanel getPanel()
	{
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(0,4));
		String[] labels= {"足球","篮球","魔术","乒乓球","看电影","魔兽世界","CS战队","羽毛球","游泳","爬山","唱歌","写博客","动物世界","拍照","弹吉他","读报纸"};
		JCheckBox[] boxs=new JCheckBox[labels.length];
		for(int i=0;i<labels.length;i++)
		{
			boxs[i]=new JCheckBox(labels[i]);
			panel.add(boxs[i]);
		}
		return panel;
	}
}
