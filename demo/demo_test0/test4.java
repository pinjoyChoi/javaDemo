package demo_test0;
/*
  获取水仙花数：
    1.三位数
    2.个位、十位、百位立方和等于这个三位数
*/

public class test4 {
  public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) {
      int ge = i % 10;
      int shi = i / 10 % 10;
      int bai = i / 10 / 10 % 10;

      if ((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i) {
        System.out.println(i);
      }
    }
  }
}
