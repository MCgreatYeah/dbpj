import javax.swing.*;

/**
 * Created by Chow on 2016/11/29.
 */
public class Teacher {
    //开设课程（可以多门）
    //上传自己开设课程的考试成绩（单独和批量）
    //为通过补考的员工修改考试成绩（其他的不能修改）
    //查看待审批的补考申请并审批
    //删除自己开设的尚未被任何部门添加到培训计划的课程
    public void showPanel() {
        Object[] obj2 = {"开设课程","上传考试成绩","修改补考员工考试成绩", "审批补考申请", "删除课程"  };
        String choice = (String) JOptionPane.showInputDialog(null, "请选择您的操作:\n", "培训教师界面", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "开设课程");
        if (choice.equals("开设课程")) {
           //增加课程
        }else if (choice.equals("上传考试成绩")) {
            //
        }else if (choice.equals("修改补考员工考试成绩")) {
            //修改补考员工考试成绩
        }else if (choice.equals("审批补考申请")) {
            //
        }else if (choice.equals("删除课程")) {
            //下拉列表显示可以删除的课程，选择后可以删除
        }
    }
}
