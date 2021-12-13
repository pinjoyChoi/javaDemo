/*
  继承demo
*/

package demo_test6.demo;

public class Demo {
  public static void main(String[] args) {
    // 创建老师类对象进行测试
    Teacher t1 = new Teacher();
    t1.setName("老师1");
    t1.setAge(30);
    System.out.println(t1.getName() + "," + t1.getAge());
    t1.teach();

    Teacher t2 = new Teacher("老师2", 25);
    System.out.println(t2.getName() + "," + t2.getAge());
    t2.teach();
    
    // 创建学生类对象进行测试
    Student s = new Student("学生", 18);
    System.out.println(s.getName() + "," + s.getAge());
    s.study();
  }
}
