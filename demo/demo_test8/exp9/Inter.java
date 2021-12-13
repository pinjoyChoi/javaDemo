package demo_test8.exp9;

public interface Inter {
  public int num = 10;
  public final int num2 = 20;
  public static final int num3 = 30;
  int num4 = 40;

  // 接口内不能有构造（非抽象）方法，可以有抽象方法
  // public Inter() {}; 
  public abstract void method();
  void show(); // 默认有 public abstract 修饰符，也就是默认是抽象方法
}
