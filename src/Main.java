import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Chow on 2016/11/29.
 */
public class Main {
    public static void main(String args[]) {
        JTextField xField = new JTextField(15);
        JTextField yField = new JTextField(15);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("用户名:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("密码:"));
        myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "登录", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + xField.getText());
            System.out.println("y value: " + yField.getText());
        }else{
            System.exit(0);
        }

        String userName = xField.getText();
        String password = yField.getText();
        //查询数据库，检查是否是合法，并返回用户类型


        String userType = "CEO";
        if (userType.equals("系统管理员")) {
            Administrator administrator = new Administrator();
            administrator.showPanel();
        }else if(userType.equals("CEO")) {
            CEO ceo = new CEO();
            ceo.showPanel();
        }

    }
}
