package demo_test8.exp7;

public class Demo {
  public static void main(String[] args) {
    Animal c = new Cat();
    c.setName("加菲");
    c.setAge(10);
    System.out.println(c.getName() + "," + c.getAge());
    c.eat();

    c = new Cat("加菲1", 15);
    System.out.println(c.getName() + "," + c.getAge());
    c.eat();
  }
}
