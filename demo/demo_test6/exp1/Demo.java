/*
  继承中构造方法的访问特点：

    子类中所有的构造方法都会访问父类中无参的构造方法
      因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
      每一个子类构造方法的第一条语句默认都是：super()
    
    如果父类中没有无参构造方法，只有带参构造方法
      方法1：通过使用super关键字去显示的调用父类的带参构造方法
      方法2：在父类中自己提供一个无参构造方法
      ## 推荐：自己给出无参构造方法
*/

package demo_test6.exp1;

public class Demo {
  public static void main(String[] args) {
    Zi z = new Zi();

    Zi z2 = new Zi(20);
  }
}
