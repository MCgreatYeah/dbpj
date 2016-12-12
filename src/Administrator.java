import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Chow on 2016/11/29.
 */
public class Administrator extends JFrame {
    //增（单独和批量）；删；改；查（按工号）


    //全都是操作登录信息那一个表
    public void showPanel() {
        Object[] obj2 = {"单独增加用户", "批量增加用户", "删除用户", "修改用户登录信息", "查找用户"};
        String choice = (String) JOptionPane.showInputDialog(null, "请选择您的操作:\n", "管理员界面", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "单独增加用户");
        if (choice.equals("单独增加用户")) {
            //输入登录信息，还要检查是否成功呢！
            JTextField xField = new JTextField(15);
            JTextField yField = new JTextField(15);
            JTextField zField = new JTextField(15);

            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("用户名:"));
            myPanel.add(xField);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("密码:"));
            myPanel.add(yField);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("用户类型:"));
            myPanel.add(zField);

            int result = JOptionPane.showConfirmDialog(null, myPanel,
                    "单独增加用户", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                System.out.println("x value: " + xField.getText());
                System.out.println("y value: " + yField.getText());
                //操作 ；提示成功
            }
          //  choice = (String) JOptionPane.showInputDialog(null, "请选择您的操作:\n", "管理员界面", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "单独增加用户");


        } else if (choice.equals("批量增加用户")) {
            //将excel或者access导入数据库，上传文件
            //还要验证数据
        } else if (choice.equals("删除用户")) {
            //查找到用户后，删除
            //显示所有用户，选择后，删除
        } else if (choice.equals("修改用户登录信息")) {
            //查找到用户后，修改
            //显示所有用户，选择后，修改
        } else if (choice.equals("查找用户")) {
            //根据用户工号，查找用户
        }
    }

    public void add() {

    }

    public void delete() {

    }

    public void modify() {

    }

    public void query() {

    }
}
