/*
  多态demo
*/

package demo_test8.exp4;

public class Demo {
  public static void main(String[] args) {
    Animal a = new Cat();
    a.setName("加菲");
    a.setAge(10);
    System.out.println(a.getName() + "," + a.getAge());
    a.eat();

    a = new Cat("加菲", 5);
    System.out.println(a.getName() + "," + a.getAge());
    a.eat();
  }
}
