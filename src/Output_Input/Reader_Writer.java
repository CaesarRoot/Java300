package Output_Input;

import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Reader_Writer {

    private TextField before;
    private TextField after;
    private JFileChooser chooser;
    private File text;
    private JFrame frame;
    private JButton button;

    public void run(){
        before = new TextField();
        after = new TextField();

        button = new JButton();
        button.addActionListener(new change());

        frame = new JFrame();
        frame.getContentPane().add(before, BorderLayout.WEST);
        frame.getContentPane().add(after, BorderLayout.EAST);
        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        Reader_Writer f = new Reader_Writer();
        f.run();
    }

    class change implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(frame);
            if(result==JFileChooser.APPROVE_OPTION){
                text = chooser.getSelectedFile();
            }

            FileReader reader = null;
            FileWriter writer = null;

            StringBuilder sb = new StringBuilder();
            int flag = 0;
            char[] temp = new char[1024];
            try{
                reader = new FileReader(text);
                while((flag=reader.read(temp))!=-1){
                    sb.append(temp);
                }
                String content = sb.toString().replace(before.getText(),after.getText());
                writer = new FileWriter(text);
                writer.write(content);
                writer.flush();
                writer.close();
            }catch (FileNotFoundException e1){
                e1.printStackTrace();
            }catch (IOException e2){
                e2.printStackTrace();
            }
        }
    }
}
