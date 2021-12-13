package demo_test7.exp2;

public class Demo {
  public static void main(String[] args) {

    final Zi z = new Zi();
    // ## final 修饰引用类型，地址值不能改变，里面的内容可以改变
    // z = new Zi();
    z.num2 = 100;
    System.out.println(z.num2);

    z.method();
    z.show();

    // ## final 修饰基本类型变量
    final int num1 = 20;
    // num1 = 100;
    System.out.println(num1);
  }
}
