/*
  字符串4

    遍历字符串
      思路：  
        1.键盘录入一个字符串，用Scanner实现
        2.public char chartAt(int index): 返回指定索引处的 char值，字符串的索引也是从0开始
        3.遍历字符串，其次要能够获取到字符串的长度：
          a.public int length()：返回此字符串的长度
          b.数组名.length：返回数组长度
          c.字符串对象.length()：字符串的长度

    统计字符次数
      思路：
        1.键盘录入字符串
        2.要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
        3.遍历字符串，得到每一个字符
        4.判断该字符串属于哪种类型，然后对应类型的统计变量 +1
          假如 ch 是一个字符，判断属于大小写还是数字，直接判断该字符是否在对应范围
            大写字母：ch >= 'A' && ch <= 'Z'
            小写字母：ch >= 'a' && ch <= 'z'
            数字：ch >= '0' && ch <= '9'
        5.输出
*/

package demo_test4;

import java.util.Scanner;

public class StrDemo4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入字符串");
    String line = sc.nextLine();

    for (int i = 0;  i < line.length(); i++) {
      System.out.println(line.charAt(i));
    }

    System.out.println("------------");

    int bigCount = 0;
    int smallCount = 0;
    int numberCount = 0;

    for (int i= 0; i < line.length(); i++) {
      char ch = line.charAt(i);

      if (ch >= 'A' && ch <= 'Z') {
        bigCount++;
      } else if (ch >= 'a' && ch <= 'z') {
        smallCount++;
      } else if (ch >= '0' && ch <= '9') {
        numberCount++;
      }
    }

    System.out.println("大写字母: " + bigCount + "个");
    System.out.println("小写字母: " + smallCount + "个");
    System.out.println("数字: " + numberCount + "个");
  }
}
