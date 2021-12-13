/*
  ArrayList 存储对象数组并遍历
*/

package demo_test5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<Student> array = new ArrayList<Student>();

    // 展示学生信息
    Student s1 = new Student("令狐冲", 20);
    Student s2 = new Student("李寻欢", 30);
    Student s3 = new Student("小白", 10);

    array.add(s1);
    array.add(s2);
    array.add(s3);

    // 手动录入部分人员信息
    for (int x = 0; x <= 2; x++) {
      addStudent(array);
    }
    

    for (int i = 0; i < array.size(); i++) {
      Student s = array.get(i);
      System.out.println(s.getName() + ", " + s.getAge());
    }
  }

  public static void addStudent(ArrayList<Student> array) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入学生姓名: ");
    String name = sc.nextLine();
    System.out.println("请输入学生年龄: ");
    int age = sc.nextInt();

    Student newStudent = new Student();
    newStudent.setName(name);
    newStudent.setAge(age);

    array.add(newStudent);
  }
}
