/*
  字符串6

    字符串反转
      需求：
        例如，abc 反转为 cba
      思路：
        字符串倒着遍历，然后拼接
*/

package demo_test4;

import java.util.Scanner;

public class StrDemo6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("请输入字符串");
    String str = sc.nextLine();

    System.out.println(strReverse(str));
  }

  // 方法
  public static String strReverse(String str) {
    String s = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      s += str.charAt(i);
    }

    return s;
  }
}
