/*
  StringBuilder
    字符串拼接(解决传统方式耗时、浪费资源的问题)
      思路：
        1.定义一个 int类型 数组，静态初始化完成数组元素的初始化
        2.定义一个字符串拼接方法
        3.调用方法，输出
    字符串反转
      思路：
        1.Scanner方法 键盘录入字符串
        2.定义字符串反转方法
        3.在方法中用StringBuilder实现字符串反转，并把结果转成String返回
        4.调用方法，输出
*/

package demo_test4;

import java.util.Scanner;

public class StringBuilderDemo4 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };

    System.out.println(arrayToString(arr));

    Scanner sc = new Scanner(System.in);
    System.out.println("请输入需要反转字符串:");

    String line = sc.nextLine();
    System.out.println(reverse(line));
  }

  // 字符串拼接
  public static String arrayToString(int[] arr) {
    StringBuilder sb = new StringBuilder();

    sb.append("[");
    
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        sb.append(arr[i]);
      } else {
        sb.append(arr[i]);
        sb.append(",");
      }
    }

    sb.append("]");
    
    return sb.toString();
  }

  // 字符串反转
  public static String reverse(String str) {
    // StringBuilder sb = new StringBuilder(str);
    // sb.reverse();
    // return sb.toString();

    return new StringBuilder(str).reverse().toString();
  }
}
