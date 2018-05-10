package basic;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BorderDemo {
	 public static void main(String[] args) 
	 {
		 JFrame frame = new JFrame("Swing�߿���ʾ");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 JPanel panel = new JPanel();      
		 panel.setLayout(new GridLayout(0,2,5,10));   //����������Ϊ���

		 panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,5));  //���ñ߾�
		  
		 JButton p1 = new JButton();

		 p1.setBorder(BorderFactory.createLineBorder(Color.red,3));

		 p1.add(new JLabel("�߱߿�"));
		 panel.add(p1);
		 
	     JPanel p2 = new JPanel();
		 p2.setBorder(BorderFactory.createEtchedBorder());
		 p2.add(new JLabel("ʴ�̱߿�"));
		 panel.add(p2);

		 
		 JPanel p3 = new JPanel();
		 p3.setBorder(BorderFactory.createRaisedBevelBorder());
		 p3.add(new JLabel("б��߿�(͹)"));
		 panel.add(p3);

		 JPanel p4 = new JPanel();
		 p4.setBorder(BorderFactory.createLoweredBevelBorder());
		 p4.add(new JLabel("б��߿�(��)"));
		 panel.add(p4);

		 JPanel p5 = new JPanel();
		 p5.setBorder(BorderFactory.createTitledBorder("����"));
		 p5.add(new JLabel("����߿�"));
		 panel.add(p5);

		 JPanel p6 = new JPanel();
		 TitledBorder tb = BorderFactory.createTitledBorder("����");
		 tb.setTitleJustification(TitledBorder.RIGHT);
		 p6.setBorder(tb);
 
		 p6.add(new JLabel("��ǩ�߿�(��)"));
		 panel.add(p6);

		 JPanel p7 = new JPanel();
		 p7.setBorder(BorderFactory.createMatteBorder(1,5,1,1,Color.yellow));
		 p7.add(new JLabel("��ɫ�߿�"));
		 panel.add(p7);

		 JPanel p8 = new JPanel();
		 Border b1 = BorderFactory.createLineBorder(Color.blue, 2);
		 Border b2 = BorderFactory.createEtchedBorder();
		 p8.setBorder(BorderFactory.createCompoundBorder(b1, b2));
		 p8.add(new JLabel("��ϱ߿�"));
		 panel.add(p8);

		 
		 JScrollPane scrollPane = new JScrollPane(panel);      //�Զ����ֹ�����
		 scrollPane.setPreferredSize(new Dimension(500,500));

		 frame.getContentPane().add(scrollPane);
		 frame.setBounds(100,100,500, 500);
		 frame.setVisible(true);
	}
}
