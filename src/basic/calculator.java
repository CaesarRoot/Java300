package basic;

import java.awt.*;
import javax.swing.*;

public class calculator {
	public static void main(String[] args)
	{
		calculator a=new calculator();
		a.go();
	}
	public void go()
	{
		JFrame frame=new JFrame("������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel=new JPanel();
		
		frame.setBounds(100, 100, 290, 282);
		
		JTextField answer=new JTextField();
		answer.setHorizontalAlignment(SwingConstants.TRAILING);  //����ˮƽ���뷽ʽ
		answer.setPreferredSize(new Dimension(12,50));  //���ÿ�ߣ���Dimension
		answer.setColumns(10);
		
		frame.getContentPane().add(answer,BorderLayout.NORTH);
		
		GridLayout gridLayout=new GridLayout(4,0);   //���У���һ����Ϊ0����ʾ���ⳤ��
		gridLayout.setHgap(5);
		gridLayout.setVgap(5);
		
		mainPanel.setLayout(gridLayout);
		
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		String[][] names= {{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","��"},{".","0","=","��"}};
		JButton[][] buttons=new JButton[4][4];
		for(int row=0;row<names.length;row++)
		{
			for(int col=0;col<names.length;col++)
			{
				buttons[row][col]=new JButton(names[row][col]);
				mainPanel.add(buttons[row][col]);
			}
		}
		
		frame.setVisible(true);
	}
}
