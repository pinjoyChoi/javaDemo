/*
  测试类
*/
package demo_test8.exp12;

public class PersonDemo {
  public static void main(String[] args) {
    PingPangPlayer pp = new PingPangPlayer();
    pp.setName("王浩");
    pp.setAge(30);
    System.out.println(pp.getName() + "," + pp.getAge());
    pp.eat();
    pp.study();
    pp.speak();

    System.out.println("----------------------");

    PingPangCoach pc = new PingPangCoach("乒乓教练", 50);
    pc.eat();
    pc.speak();

    System.out.println("----------------------");

    BasketballPlayer bp = new BasketballPlayer("姚明", 35);
    System.out.println(bp.getName() + "," + bp.getAge());
    bp.eat();
    bp.study();

    System.out.println("----------------------");
  }
}
