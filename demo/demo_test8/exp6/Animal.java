package demo_test8.exp6;

public abstract class Animal {
  private int age = 20;
  private final String city = "北京";

  public Animal() {};

  public Animal(int age) {
    this.age = age;
  } 

  public void show() {
    age = 30;
    System.out.println(age);
    System.err.println(city);
  }

  public abstract void eat();
}
