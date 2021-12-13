package demo_test8.exp10;

public class Cat extends Animal implements Jump {

  public Cat() {}

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("猫吃鱼");
  }

  @Override
  public void jumpping() {
    System.out.println("猫跳高");
  }
}
