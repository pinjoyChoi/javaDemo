package demo_test8.exp12;

public class BasketballPlayer extends Player {
  
  public BasketballPlayer() {};

  public BasketballPlayer(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("篮球运动员吃饭");
  }

  @Override
  public void study() {
    System.out.println("篮球运动员学习篮球");
  }
}
