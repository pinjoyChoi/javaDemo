/*
  字符串5

    拼接字符串(传统方法既耗时又浪费资源：用 StringBuilder 可解决)
      需求：
        定义一个方法，把 int数组 中的数据按照指定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        例如，数组为 int[] arr = { 1, 2, 3 }, 指向方法后的输出结果：[1, 2, 3]
      思路：
        1.定义一个 int类型 的数组，用惊天初始化完成数组元素的初始化
        2.定义一个方法，用于把 int数组 中的数据按照指定格式拼接成一个字符串返回，返回值类型 String，参数列表 int[] arr
        3.在方法中遍历数组，按照要求进行拼接
        4.输出
*/

package demo_test4;

public class StrDemo5 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };

    System.out.println(arrayToString(arr));
  }

  // 方法
  public static String arrayToString(int[] arr) {
    String s = "";

    s += "[";

    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        s += arr[i];
      } else {
        s += arr[i];
        s += ", ";
      }
    }

    s += "]";

    return s;
  }
}
