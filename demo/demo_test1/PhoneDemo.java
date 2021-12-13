/* 对象的使用 */

package demo_test1;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p = new Phone();

    p.brand = "小米";
    p.price = 2999;

    System.out.println(p.brand);
    System.out.println(p.price);

    p.call();
    p.seendMessage();
  }
}
