/*
  抽象运动员类
*/

package demo_test8.exp12;

public abstract class Player extends People {
  public Player() {};

  public Player(String name, int age) {
    super(name, age);
  }

  public abstract void study();
}
