/*
  构造方法：
    构造方法的创建：
      如果没有定义构造方法，系统将给出一个默认的无参数构造方法
      如果定义了构造方法，系统将不在提供默认的构造方法
    构造方法的重载：
      如果自定义了带参数的构造方法，还要使用无参数构造方法，必须再写一个无参数构造方法
    
      * 无论是否使用，都手工书写无参数构造方法
*/

package demo_test2;

public class StudentDemo {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.show();

    Student s2 = new Student("小明");
    s2.show();

    Student s3 = new Student("小明", 20);
    s3.show();
  }
}
