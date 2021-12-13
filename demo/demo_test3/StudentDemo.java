/*
  创建对象并为其成员赋值的两种方式
    1.无参构造方法创建对象后使用 setXXX() 赋值
    2.使用带参数构造方法直接创建带有属性值的对象
*/

package demo_test3;

public class StudentDemo {
  public static void main(String[] args) {
    // 无参构造方法创建对象后使用 setXXX() 赋值
    Student s1 = new Student();
    s1.setName("小明");
    s1.setAge(30);
    s1.show();

    Student s2 = new Student("小明", 20);
    s2.show();
  }
}
