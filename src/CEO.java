import javax.swing.*;

/**
 * Created by Chow on 2016/11/29.
 */
public class CEO {
    //查看除了用户（登录）信息以外的教师信息，课程信息（包括成绩），部门主管信息，员工信息
    public void showPanel() {
        Object[] obj2 = {"教师信息", "课程信息", "查看课程成绩","部门主管信息", "员工信息" };
        String choice = (String) JOptionPane.showInputDialog(null, "请选择您要查看的信息:\n", "热烈欢迎CEO登录系统", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "教师信息");
        if (choice.equals("教师信息")) {

        }else if (choice.equals("课程信息")) {

        }else if (choice.equals("查看课程成绩")) {

        }else if (choice.equals("部门主管信息")) {

        }else if (choice.equals("员工信息")) {

        }
    }
}
