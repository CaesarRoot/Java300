package basic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Table {
	public static void main(String[] args)
	{
		Table a=new Table();
		JTable table=a.getTable();
		
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel=new JPanel();
		
		JTableHeader tableHeader=table.getTableHeader();    //����ӵ������������������У�Ҫ�Ȼ�ñ�ͷ�࣬����ӱ�ͷ������û�б�ͷ
		mainPanel.add(tableHeader);
		mainPanel.add(table);
		
		frame.getContentPane().add(mainPanel);
		frame.setSize(1000, 500);
		frame.setVisible(true);
	}
	public JTable getTable()
	{
		JTable table=new JTable();
		String[] columns= {"ID","����","�Ա�","��������","����","��ס��","��ע"};
		int[] columnWidth= {20,60,20,80,140,120,140};
		DefaultTableModel model=new DefaultTableModel(columns,15);   //�����������ģ�ͣ���һ�������������飬�ڶ���ָ�����������пհ�����
		table.setModel(model);       //���ñ������ģ��
		TableColumnModel columnModel=table.getColumnModel();   //��ȡ��ģ��
		int count=columnModel.getColumnCount();                //��ȡ������
		for(int i=0;i<count;i++)
		{
			TableColumn column=columnModel.getColumn(i);
			column.setPreferredWidth(columnWidth[i]);          //������Ԫ���趨�еĿ��
		}
		return table;
	}
}
