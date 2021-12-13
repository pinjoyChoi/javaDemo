package demo_test7.exp3;

public class StaticDemo {
  public static void main(String[] args) {
    Studen s1 = new Studen();
    // ## static 修饰了 address，建议从类上访问
    // s1.address = "123";
    Studen.address = "123";
    s1.name = "学生1";
    s1.age = 20;
    s1.show();

    Studen s2 = new Studen();
    s2.name = "学生2";
    s2.age = 25;
    s2.show();
  }

  // 非静态成员变量
  private String str1 = "111";
  // 静态成员变量
  private static String str2 = "222";

  // 非静态成员方法
  public void show1() {

  }

  // 非静态成员方法
  public void show2() {
    System.out.println(str1);
    System.out.println(str2);
    show1();
    show3();
  }

  // 静态成员方法
  public static void show3() {

  }

  // 静态成员方法
  public static void show4() {
    // System.out.println(str1);
    System.out.println(str2);
    // show1();
    show3();
  }
}
