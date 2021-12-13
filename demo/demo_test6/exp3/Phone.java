/* 手机类 */

package demo_test6.exp3;

public class Phone {
  private void saw() {
    System.out.println("Fu类的私有方法");
  }

  // 不加 public 为默认访问修饰符
  void saw2() {
    System.out.println("Fu类方法");
  }

  public void call(String name) {
    System.out.println("给" + name + "打电话");
  }
}
