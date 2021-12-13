/*
  字符串3

    字符串比较
    用户登录案例：
      需求：已知用户名和密码，请使用程序实现模拟用户登录。共三次机会，给出相应提示。
      思路：
        1.已知用户名和密码，定义两个字符串表示
        2.键盘录入要登录的用户名和密码，用 Scanner 实现
        3.拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals()方法实现
        4.循环实现多次机会，登陆成功， break 结束循环
*/

package demo_test4;

import java.util.Scanner;

public class StrDemo3 {
  public static void main(String[] args) {
    char[] chs = { 'a', 'b', 'c' };
    String s1 = new String(chs);
    String s2 = new String(chs);

    // 直接赋值的方式得到对象
    String s3 = "abc";
    String s4 = "abc";

    // 比较字符串对象地址是否相同
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s3 == s4);

    System.out.println("---------------");

    // 比较字符串是否相同
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s3.equals(s4));

    System.out.println("---------------");

    // 用户登录
    String username = "admin";
    String password = "123";

    for (int i = 3; i >0; i--) {
      Scanner sc = new Scanner(System.in);

      System.out.println("请输入用户名: ");
      String name = sc.nextLine();

      System.out.println("请输入密码: ");
      String pwd = sc.nextLine();

      if (name.equals(username) && pwd.equals(password)) {
        System.out.println("登录成功");
        break;
      } else {
        if (i > 1) {
          System.out.println("登录失败，你还有" + (i - 1) + "次机会");
        } else {
          System.out.println("你的账户被锁定");
        }
      }
    }
  }
}
