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
		
		JTableHeader tableHeader=table.getTableHeader();    //若添加到滚动面板以外的容器中，要先获得表头类，并添加表头，否则将没有表头
		mainPanel.add(tableHeader);
		mainPanel.add(table);
		
		frame.getContentPane().add(mainPanel);
		frame.setSize(1000, 500);
		frame.setVisible(true);
	}
	public JTable getTable()
	{
		JTable table=new JTable();
		String[] columns= {"ID","姓名","性别","出生日期","邮箱","居住地","备注"};
		int[] columnWidth= {20,60,20,80,140,120,140};
		DefaultTableModel model=new DefaultTableModel(columns,15);   //创建表格数据模型，第一个代表列名数组，第二个指定创建多少行空白数据
		table.setModel(model);       //设置表格数据模型
		TableColumnModel columnModel=table.getColumnModel();   //获取列模型
		int count=columnModel.getColumnCount();                //获取列数量
		for(int i=0;i<count;i++)
		{
			TableColumn column=columnModel.getColumn(i);
			column.setPreferredWidth(columnWidth[i]);          //以数组元素设定列的宽度
		}
		return table;
	}
}
