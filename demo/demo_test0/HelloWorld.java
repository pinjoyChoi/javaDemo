package demo_test0;
/*
  java类格式：
    pulic class 类名 {
      
    }
*/
public class HelloWorld {
	public static void main(String[] args) {
    // 1.数据类型
		System.out.println("HelloWorld"); // 字符串常量
		System.out.println('A'); // 字符常量
		System.out.println(88); // 整数常量
		System.out.println(8.8); // 小数常量
		System.out.println(true); // 布尔常量
		System.out.println(false);
		// System.out.println(null); // 空常量不能直接输出
    
    // 2. 定义变量
    int a = 10;
    byte b = 100;
    short c = 1000;
    double d = 3.14;
    char e = 'a';
    boolean f = true;

    long g = 1000000000; // long类型定义变量防止整数过大后面加 L（值默认是 int类型，超过int范围会报错）
    g = 10000000000L;

    float h = 13.14F; // float类型定义变量后面加 F（值默认是 double类型）

    System.out.println(h);
    a = 20;
    System.out.println(a);
	}
}