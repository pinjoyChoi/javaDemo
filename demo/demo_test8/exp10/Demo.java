/*
  测试类
*/

package demo_test8.exp10;

public class Demo {
  public static void main(String[] args) {
    Jump j = new Cat();
    j.jumpping();
    System.out.println("------------0");

    Animal a = new Cat();
    a.setName("cat1");
    a.setAge(2);
    System.out.println(a.getName() + "," + a.getAge());
    a.eat();
    System.out.println("------------1");

    a = new Cat("cat2", 5);
    System.out.println(a.getName() + "," + a.getAge());
    a.eat();
    System.out.println("------------2");

    Cat c = new Cat();
    // 这里 setName 和 setAge 无效
    // c.setName("cat3");
    // c.setAge(10);
    System.out.println(a.getName() + "," + a.getAge());
    c.eat();
    c.jumpping();
    System.out.println("------------3");
  }
}
