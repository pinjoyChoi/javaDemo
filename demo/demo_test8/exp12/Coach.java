/*
  抽象教练的类
*/

package demo_test8.exp12;

public abstract class Coach extends People {
  public Coach() {};

  public Coach(String name, int age) {
    super(name, age);
  }

  public abstract void teach();
}
