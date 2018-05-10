package Output_Input;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class listFiles {
    private JFrame frame;
    private Label label;
    private TextArea text;
    private JButton button;
    private JTable table;
    private DefaultTableModel model;
    private JPanel panel;

    public void run(){
        frame = new JFrame();
        panel = new JPanel();
        label = new Label("输入文件扩展名：");
        button = new JButton("选择文件夹");
        button.addActionListener(new do_button());
        text = new TextArea(1,10);

        String[][] datas={{ "文件名", "文件大小", "修改日期" }};
        String[] titles = { "文件名", "文件大小", "修改日期" };
        model = new DefaultTableModel(datas, titles);
        table = new JTable(model);

        panel.add(label, BorderLayout.NORTH);
        panel.add(text, BorderLayout.NORTH);
        panel.add(button, BorderLayout.NORTH);
        panel.add(table, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String [] args){
        listFiles f = new listFiles();
        f.run();
    }

    class do_button implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            final String fileType = text.getText();
            if(fileType.isEmpty()){
                JOptionPane.showMessageDialog(frame, "请输入文件类型", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            JFileChooser chooser = new JFileChooser();
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setMultiSelectionEnabled(false);
            int result = chooser.showOpenDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION) {
                File[] listFiles = chooser.getSelectedFile().listFiles(new java.io.FileFilter(){
                    @Override
                    public boolean accept(File pathname) {
                        if(pathname.getName().endsWith(fileType)){
                            return true;
                        }
                        else{
                            return false;
                        }
                    }
                });
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for(File file :listFiles){
                    String name = file.getName();
                    long size = file.length();
                    String modifyData = format.format(new Date(file.lastModified()));
                    model.addRow(new String[] {name,""+size, modifyData});
                }
                table.setModel(model);
            }
        }
    }
}
