package demo_test0;
/*
  demo
*/

public class test7 {
  public static void main(String[] args) {
    getChicken();
    getRabbit();
    getReverseArr();
  }

  // 百钱百鸡：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一
  public static void getChicken() {
    for (int x = 0; x <= 20; x++) {
      for (int y = 0; y <= 33; y++) {
        int z = 100 - x - y;
        if (z%3 == 0 && 5*x + 3*y + z/3 == 100) {
          System.out.println(x + "," + y + "," + z);
        }
      }
    }
  }

  // 不死神兔：1对兔子到第3个月（满2个月）生出1对小兔子，20个月有多少只兔子
  // 1 1 2 3 5 ... ：arr[i] = arr[i-2] + arr[i-1]
  public static void getRabbit() {
    int[] arr = new int[20];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < arr.length; i++) {
      arr[i] = arr[i-2] + arr[i-1];
    }

    System.out.println(arr[19]);
  }

  // 数组反转
  public static void getReverseArr() {
    int[] arr = { 10, 20, 40, 60 };

    for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
    }
    
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + ",");
      }
    }
  }
}
