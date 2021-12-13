/*
  @Override：
    可以检测是否为重写的方法（检测方法名是否和父类相同）
    子类方法访问权限不能更低（public > 默认 > 私有）
*/

package demo_test6.exp3;

public class NewPhone extends Phone {
  // 父类的私有方法不能重写
  // @Override
  // public void saw() {
  //   System.out.println("重写父类的私有方法");
  // }

  @Override
  public void call(String name) {
    System.out.println("开启视频功能");
    super.call(name);
  }

  @Override
  // void saw2() {
  //   System.out.println("重写Fu类方法");
  // }
  public void saw2() {
    System.out.println("重写Fu类方法");
  }
}
