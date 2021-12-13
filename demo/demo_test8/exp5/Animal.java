/*
  抽象类
*/

package demo_test8.exp5;

public abstract class Animal {
  // 抽象方法
  public abstract void eat();

  public void sleep() {
    System.err.println("睡觉");
  }
}
