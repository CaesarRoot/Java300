package SevenChapter.ActionCommand;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fourbutton extends JFrame implements ActionListener{
    private JPanel jp = null;
    private JButton jb1 = null;
    private JButton jb2 = null;
    private JButton jb3 = null;
    private JButton jb4 = null;

    public static void main(String[] args) {
        Fourbutton tb = new Fourbutton();
    }
    //构造器
    public Fourbutton(){
        jp = new JPanel();
        jb1 = new JButton("Black");
        jb2 = new JButton("Red");
        jb3 = new JButton("Blue");
        jb4 = new JButton("Yellow");
        this.add(jp);

        this.add(jb1,BorderLayout.NORTH);
        this.add(jb2, BorderLayout.SOUTH);
        this.add(jb3,BorderLayout.WEST);
        this.add(jb4,BorderLayout.EAST);
        //注册监听
        jb1.addActionListener(this);
        jb1.setActionCommand("Black");
        jb2.addActionListener(this);
        jb2.setActionCommand("Red");
        jb3.addActionListener(this);
        jb3.setActionCommand("Blue");
        jb4.addActionListener(this);
        jb4.setActionCommand("Yellow");
        this.setTitle("点击按钮");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    //对事件处理的方法
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Black")){      //实际上就是按钮上的字
            System.out.println("你点击的黑色按钮");
            jp.setBackground(Color.BLACK);
        }else if(e.getActionCommand().equals("Red")){
            System.out.println("你点击的红色按钮");
            jp.setBackground(Color.RED);
        }else if(e.getActionCommand().equals("Blue")){
            System.out.println("你点击的蓝色按钮");
            jp.setBackground(Color.BLUE);
        }else if(e.getActionCommand().equals("Yellow")){
            System.out.println("你点击的黄色按钮");
            jp.setBackground(Color.YELLOW);
        }else{
            System.out.println("不知道");
        }

    }

}

