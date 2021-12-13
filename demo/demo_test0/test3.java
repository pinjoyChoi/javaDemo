package demo_test0;
/*
  流程控制
    顺序结构
    分支结构（if、switch）
    循环结构（for、while、do...while）
*/
import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
    // 判断奇偶
    Scanner sc = new Scanner(System.in);

    int i = sc.nextInt();

    if (i % 2 == 0) {
      System.out.println(i + "是偶数");
    } else {
      System.out.println(i + "是奇数");
    }
  }
}
