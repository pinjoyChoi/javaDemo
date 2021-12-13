package demo_test0;
/*
  java运算符
    注意：
      1.整数相除只能得到整数，要想得到小数，必须有浮点数参与
      2.字符 "+" 操作时，使用字符在计算机底层对应的数据进行计算
      3.算数表达式中包含多个基本数据类型的值得时候，整个算数表达式的类型会自动进行提升
        byte类型、short类型、char类型提升为 int类型
        整个表达式的类型自动提升到表达式中最高等级操作数同样的类型：
          等级顺序：byte,short,char => int => long => float => double
      4.字符串 "+" 操作时，拼接
*/
public class test1 {
  public static void main(String[] args) {
    System.out.println(6 / 4);
    System.out.println(6.0 / 4);

    int a = 10;
    char b = 'A'; // 字符 'A' 的值为65
    System.out.println(a + b);

    // char ch = a + b;
    int c = a + b;
    System.out.println(c);

    // int m = 10 + 13.14;
    double m = 10 + 13.14;
    System.out.println(m);

    System.out.println(10 + "BC");
    System.out.println(10 + 6 + "BC");
    System.out.println("BC" + 10 + 6);

  }
}