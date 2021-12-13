package demo_test6.exp2;

public class Zi extends Fu {
  public void method() {
    System.out.println("Zi中的method()方法被调用");
  }

  public void show() {
    super.show();
    System.out.println("Zi中的show()方法被调用");
  }
}
