import javax.swing.*;

/**
 * Created by Chow on 2016/11/29.
 */
public class Manager {
    //增删改所属员工基本信息
    //查看员工选课以及成绩,不能删改
    //查看所有已开设的课程信息
    //制定部门计划（必修课程）
    //
    public void showPanel() {
        Object[] obj2 = {"增加部门员工信息","删除部门员工信息","查看部门员工信息", "查看已开设课程信息", "查看员工选课以及成绩", "制定部门计划" };
        String choice = (String) JOptionPane.showInputDialog(null, "请选择您的操作:\n", "部门主管界面", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "增加部门员工信息");
        if (choice.equals("增加部门员工信息")) {
            //输入员工信息
            //检查是否成功
        }else if (choice.equals("删除部门员工信息")) {
            //下拉列表选择员工 删除

        }else if (choice.equals("查看部门员工信息")) {
            //显示员工信息
        }else if (choice.equals("查看已开设课程信息")) {
            //查看课程信息后（课程编号、开课教师（换成名字）、课程名称、学时），以及是否已加入部门计划

        }else if (choice.equals("查看员工选课以及成绩")) {
            //下拉列表显示员工，选中一个员工
            //--> 查看选课以及成绩 按钮
            //显示课程 成绩
        }else if (choice.equals("制定部门计划")) {
            //显示部门计划的课程
            //--> 加入新课程到部门计划，从部门计划中删除，取消
            //--> 加入：下拉列表显示未加入的
            //--> 删除： 下拉列表显示已加入的

        }
    }
}
