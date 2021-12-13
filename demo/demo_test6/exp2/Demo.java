/*
  通过子类对象访问一个方法：
    子类成员范围找
    父类成员范围找
    如果都没有就报错（不考虑父亲的父亲）
*/

package demo_test6.exp2;

public class Demo {
  public static void main(String[] args) {
    Zi z = new Zi();
    z.method();
    z.show();
  }
}
