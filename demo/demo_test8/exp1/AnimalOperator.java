package demo_test8.exp1;

public class AnimalOperator {
  // public void useAnimal(Cat c) {
  //   c.eat();
  // }

  // public void useAnimal(Dog d) {
  //   d.eat();
  // }

  public void useAnimal(Animal a) {
    a.eat();
    // ## 多态不能访问子类独有的方法
    // a.lookDoor();
  }
}
