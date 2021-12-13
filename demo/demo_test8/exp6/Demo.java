/*
  抽象类成员特点
    1.可以有成员变量：
      可以是变量，可以是常量 final
    2.可以有构造方法：
      虽然抽象类本身不能实例化，但是构造方法可以用于子类访问父类数据的初始化
    3.成员方法：
      可以有抽象方法，限定子类必须完成某些动作
      也可以有非抽象方法，提高代码复用性
*/

package demo_test8.exp6;

public class Demo {
  public static void main(String[] args) {
    Animal a = new Cat();
    a.eat();
    a.show();
  }
}
