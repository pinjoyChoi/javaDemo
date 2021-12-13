package demo_test8.exp9;

public class InterImpl implements Inter {
// 类Object 是类层次结构的根，每个类都有Object作为超类。所有对象（包括数组）都实现了这个类的方法。
// public class InterImpl extends Object implements Inter {

  // 该构造方法的super方法调父类的构造方法，但是Inter接口内不存在构造（非抽象）方法，super是调用的根 Object的方法
  public InterImpl() {
    super();
  }

  @Override
  public void method() {
    System.out.println("Inter接口的抽象method方法");
  }

  @Override
  public void show() {
    System.out.println("Inter接口的抽象show方法");
  }
}
