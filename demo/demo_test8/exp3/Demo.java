/*
  多态
    向上转型：
      从子到父
      父类引用指向子类对象
    向下转型：
      从父到子
      父类引用转为子类对象
*/

package demo_test8.exp3;

public class Demo {
  public static void main(String[] args) {
    // 向上转型
    Animal a = new Cat();
    a.eat();
    
    // 向下转型
    // Cat c = new Cat();
    // c.playGame();
    Cat c = (Cat)a;
    c.playGame();


  }
}
