/*
  多态中的成员访问特点：
    不能访问子类独有的方法
*/

package demo_test8.exp1;

public class Demo {
  public static void main(String[] args) {
    AnimalOperator animal = new AnimalOperator();

    Cat c = new Cat();
    animal.useAnimal(c);

    Dog d = new Dog();
    animal.useAnimal(d);
  }
}
