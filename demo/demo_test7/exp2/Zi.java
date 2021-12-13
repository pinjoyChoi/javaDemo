package demo_test7.exp2;

public class Zi extends Fu {
  public int num2 = 10;

  public final int age = 20;

  public void show() {
    // ## final 修饰的变量，无法更改
    // age = 100;
    System.out.println(age);
  }

  // ## Fu类的 final 状态的方法，子类无法重写
  // @Override
  // public void method() {
  //   System.out.println("Zi method");
  // }
}
