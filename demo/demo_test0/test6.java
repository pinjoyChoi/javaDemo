package demo_test0;
/*
  方法参数传递基本类型、引用类型
*/

public class test6 {
  public static void main(String[] args) {
    int a = 100;
    System.out.println(a);
    changeInt(a);
    System.out.println(a);

    int[] arr = { 1, 2, 3 };
    System.out.println(arr[1]);
    changeArr(arr);
    System.out.println(arr[1]);
  }
 
  // 基本类型，修改形参，影响实际参数
  public static void changeInt(int a) {
    a = 200;
  }

  // 对于引用类型的参数，修改形参，影响实际参数
  public static void changeArr(int[] arr) {
    arr[1] = 200;
  }
}
