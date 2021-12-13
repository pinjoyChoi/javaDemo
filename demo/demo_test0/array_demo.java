package demo_test0;
public class array_demo {
  public static void main(String[] args) {
    // 数组动态初始化
    int[] arr = new int[3];
    /*
      左侧： 
        int：数组中元素类型是int类型
        []：创建类型是数组
        arr：数组名称
      右侧：
        new：为数组申请内存空间
        int：数组中元素类型是int类型
        []：创建类型是数组
        3：数组长度为3，也就是数组个数
    */

    // 数组静态初始化
    // int[] arr1 = new int[] { 1, 2, 3 };
    int[] arr1 = { 1, 2, 3 };


    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println(arr1);
    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
  }
}
