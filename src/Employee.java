import javax.swing.*;

/**
 * Created by Chow on 2016/11/29.
 */
public class Employee {
    private String id;
    private String name;
    private String depa;


    public Employee(String id, String name, String depa) {
        this.id = id;
        this.name = name;
        this.depa = depa;
    }

    //查看本部门计划
    //查看成绩
    //报名参加选修课
    //对未及格的课程申请补考
    public void showPanel() {
        Object[] obj2 = {"查看本部门计划", "查看成绩", "报名参加选修课", "申请补考",};
        String choice = (String) JOptionPane.showInputDialog(null, "请选择您的操作:\n", "员工界面", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "查看本部门计划");
        if (choice.equals("查看本部门计划")) {
            //课程编号，课程名称，开课老师，学时

        } else if (choice.equals("查看成绩")) {
            //显示：课程编号，课程名称，成绩    （信息还可以多一点）

        } else if (choice.equals("报名参加选修课")) {
            //显示所有除了必修课之外的课程:课程编号，课程名称，开课老师，学时，报名状态（已报名，未报名）
            //--> “未报名”有一个报名操作
        } else if (choice.equals("申请补考")) {
            //得到考试不合格的课程：课程编号，课程名称，成绩，成绩上传时间，申请状态（不可申请，等待审批，已批准，未申请），补考费用
            // --> “未申请”有一个补考申请操作

        }
    }
}
