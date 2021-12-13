/*
  StringBuilder 和 String 相互转换
    StringBuilder 转换 String
      public String toString(): 通过toString()就可以实现把 StringBuilder 转换为 String

    String 转换 StringBuilder
      public StringBuilder(String s): 通过构造方法可以把 String 转换为 StringBuilder
*/

package demo_test4;

public class StringBuilderDemo3 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");

    // String s = sb; // 错误
    String s = sb.toString();
    System.out.println("string: " + s);

    // StringBuilder sb2 = s; // 错误
    StringBuilder sb2 = new StringBuilder(s);
    System.out.println("StirngBuilder: " + sb2);
  }
}
