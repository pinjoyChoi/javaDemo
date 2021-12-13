/*
  StringBuilder 方法：
    1.public StringBuilder apped(任意类型)
        添加数据，并返回对象本身
    2.public StringBuilder reverse()
        返回相反的字符序列
*/

package demo_test4;

public class StringBuilderDemo2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    sb.append("hello").append("world");

    System.out.println("sb: " + sb);

    sb.reverse();
    System.out.println("reverseSb: " + sb);
  }
}
