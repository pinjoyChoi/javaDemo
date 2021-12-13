/*
  方法重写：子类出现了和父类中一模一样的方法声明

    应用：
      当子类需要父类的功能，而功能主体子类有自己特定内容时，可以重写父类中的方法，这样，既沿袭了父类的功能，又定义了子类特有的内容
    
    @Override：重写标识
*/

package demo_test6.exp3;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p = new Phone();
    p.call("小明");

    NewPhone np = new NewPhone();
    np.call("小明");
  }
}
