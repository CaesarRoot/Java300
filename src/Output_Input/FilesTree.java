package Output_Input;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.io.FileFilter;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

public class FilesTree extends JFrame {

    private JTree tree;
    private JScrollPane scrollPane;

    public void run(){
        File[] disks = File.listRoots();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode();
        for(File disk : disks){
            root.add(new DefaultMutableTreeNode(disk));   //参数类型为 Object
        }
        tree = new JTree(root);                           //默认情况下叶节点没有children 设置成true 则子节点不能有children
        tree.addTreeSelectionListener(new do_tree());

        scrollPane = new JScrollPane(tree, VERTICAL_SCROLLBAR_AS_NEEDED, HORIZONTAL_SCROLLBAR_AS_NEEDED);

        this.add(scrollPane, BorderLayout.CENTER);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        FilesTree f = new FilesTree();
        f.run();
    }

    class do_tree implements TreeSelectionListener{
        @Override
        public void valueChanged(TreeSelectionEvent e) {
            DefaultMutableTreeNode selectNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            File selectFile = (File) selectNode.getUserObject();
            if (selectFile.isDirectory()) {
                File[] files = selectFile.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.isHidden()) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                });
                for (File file : files) {
                    selectNode.add(new DefaultMutableTreeNode(file));
                }
            }
        }
    }
}
