/*
  字符串1

    Scanner:
      用于获取键盘录入数据。(基本数据类型，字符串数据)
    
    pblic String nextLine();
      获取键盘录入字符串数据
*/

package demo_test4;

import java.util.Scanner;

public class StrDemo1 {
  public static void main(String[] args) {
    // 创建对象
    Scanner sc = new Scanner(System.in);

    // 接收数据
    System.out.println("请输入一个字符创数据：");
    String line = sc.nextLine();

    // 输出结果
    System.out.println("你输入的数据是：" + line);
  }
}
