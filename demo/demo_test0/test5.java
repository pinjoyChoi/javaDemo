package demo_test0;
/*
  方法、带返回值方法
*/

public class test5 {
  public static void main(String[] args) {
    print();
    getMax(10, 20);
    System.out.println(isEventNumber(7));
  }

  // 普通方法
  public static void print() {
    System.out.println(123);
  }

  // 带参方法
  public static void getMax(int a, int b) {
    if (a > b) {
      System.out.println(a);
    } else {
      System.out.println(b);
    }
  }

  // 带返回值方法
  public static boolean isEventNumber(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
