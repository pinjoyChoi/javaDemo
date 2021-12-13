/*
  学生管理系统
*/

package myStudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<Student>();

    while(true) {
      System.out.println("----------学生管理系统----------");
      System.out.println("1.添加学生");
      System.out.println("2.删除学生");
      System.out.println("3.修改学生");
      System.out.println("4.查看所有学生");
      System.out.println("5.退出");
      System.out.println("--------------------------------");
      System.out.println("请输入你的选择: ");

      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();

      switch (line) {
        case "1":
          System.out.println("添加学生");
          addStudent(array);
          break;
        case "2":
          deleteStudent(array);
          break;
        case "3":
          editStudent(array);
          break;
        case "4":
          viewStudent(array);
          break;
        case "5":
          System.out.println("谢谢使用");
          // break;
          System.exit(0); // JVM 退出
      }
    }
  }

  // 添加学生
  public static void addStudent(ArrayList<Student> array) {
    Scanner sc = new Scanner(System.in);

    String sid;

    // 判断学号重复
    while(true) {
      System.out.println("请输入学生学号: ");
      sid = sc.nextLine();

      boolean flag = isUsed(array, sid);

      if (flag) {
        System.out.println("学号已经被占用，请重新输入");
      } else {
        break;
      }
    }

    System.out.println("请输入学生名字: ");
    String name = sc.nextLine();
    System.out.println("请输入学生年龄: ");
    String age = sc.nextLine();
    System.out.println("请输入学生住址: ");
    String address = sc.nextLine();

    Student newStudent = new Student();
    newStudent.setSid(sid);
    newStudent.setName(name);
    newStudent.setAge(age);
    newStudent.setAddress(address);

    array.add(newStudent);
    System.out.println("添加成功");
  }

  public static boolean isUsed(ArrayList<Student> array, String sid) {
    boolean flag = false;
    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      if (s.getSid().equals(sid)) {
        flag = true;
        break;
      }
    }

    return flag;
  }

  // 查看学生
  public static void viewStudent(ArrayList<Student> array) {
    // 判断集合中是否有数据
    if(array.size() == 0) {
      System.out.println("无信息，请先添加信息再查询");
      return;
    }

    // 表头
    // \t 是 tab键 位置
    System.out.println("学号\t姓名\t年龄\t居住地");
    
    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress() + "\t");
    }
  }

  // 删除学生
  public static void deleteStudent(ArrayList<Student> array) {
    // 键盘录入删除学生的学号
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入删除学生的学号：");
    String sid = sc.nextLine();

    // 遍历集合，删除对应学生
    int index = -1;

    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      if (s.getSid().equals(sid)) {
        index = i;
      }
    }

    // 提示
    if (index == -1) {
      System.out.println("学号不存在，请重新输入");
    } else {
      array.remove(index);
      System.out.println("删除学生成功");
    }
  }

  // 修改学生
  public static void editStudent(ArrayList<Student> array) {
    // 键盘录入修改学生的学号
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入修改学生的学号：");
    String sid = sc.nextLine();

    // 遍历集合，修改对应学生
    int index = -1;
    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      if (s.getSid().equals(sid)) {
        index = i;
      }
    }

    // 提示
    if (index == -1) {
      System.out.println("学号不存在，请重新输入");
    } else {
      System.out.println("请输入新学生名字: ");
      String name = sc.nextLine();
      System.out.println("请输入新学生年龄: ");
      String age = sc.nextLine();
      System.out.println("请输入新学生住址: ");
      String address = sc.nextLine();

      Student newStudent = new Student();
      newStudent.setSid(sid);
      newStudent.setName(name);
      newStudent.setAge(age);
      newStudent.setAddress(address);

      array.set(index, newStudent);
      System.out.println("修改学生成功");
    }
  }
}
