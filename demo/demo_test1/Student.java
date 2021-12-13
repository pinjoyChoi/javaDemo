/*
  private 关键字的使用:
    1.不能直接访问对应变量
    2.提供对应 getXXX/setXXX 方法
  
  this 关键字:
    1.指代成员变量
    2.  如果方法形参与成员变量同名，不带 this 修饰的是形参，而不是成员变量
        如果方法形参没有与成员变量同名，不用加 this 也是成员变量
*/

package demo_test1;

public class Student {
  String name;
  private int age;
  private String job;

  public void setAge(int a) {
    if (a < 0 || a > 120) {
      System.out.println("输入年龄有误");
    } else {
      age = a;
    }
  }

  public int getAge() {
    return age;
  }

  public void setJob(String job) {
    // job = job
    this.job = job;
  }

  public String getJob() {
    return job;
  }

  public void show() {
    System.out.println(name + "," + age + "," + job);
  }
}
