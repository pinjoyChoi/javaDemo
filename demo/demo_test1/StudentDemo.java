/* private 关键字的使用 */

package demo_test1;

public class StudentDemo {
  public static void main(String[] args) {
    Student s = new Student();

    s.name = "小明";
    // s.age = 20;  // private属性 无法直接访问 age

    s.setAge(20);
    // s.setAge(-30);

    s.setJob("屠夫");
    
    s.show();
  }
}
