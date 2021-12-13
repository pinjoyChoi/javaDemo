/*
  抽象类特点
    Animal.java 为抽象类
*/

package demo_test8.exp5;

public class Demo {
  public static void main(String[] args) {
    // 错误，因为抽象类不能实例化，要通过抽象类的子类进行实例化
    // Animal a = new Animal();
    Animal a = new Cat();
    a.eat();
    a.sleep();
  }
}
