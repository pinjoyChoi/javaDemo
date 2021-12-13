package demo_test0;
/*
  Scanner使用：
    1.import java.util.Scanner;
    2.Scanner sc = new Scanner(System.in);
    3.int i = sc.nextInt();
*/
import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = sc.nextInt();
    int j = sc.nextInt();
    int k = sc.nextInt();

    int tem = i > j ? i : j;
    int max = tem > k ? tem : k;

    System.out.println("max:" + max);
  }
}
