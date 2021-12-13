package demo_test6.demo;

public class Student extends Person {
  public Student() {};

  public Student(String name, int age) {
    super(name, age);
  }

  public void study() {
    System.out.println("好好学习");
  }
}
