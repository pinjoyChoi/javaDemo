/*
  多态
    多态中成员访问特点：
      成员变量：编译看左边、执行看左边
      成员方法：编译看左边、执行看右边
    
      原因：
        因为成员方法有重写，成员变量没有  

*/
package demo_test8.exp2;

public class Demo {
  public static void main(String[] args) {
    Animal a = new Cat();

    // ## 多态编译看左边，Animal 没有 weight、playGame，所以 a.weight 取不到
    // ## 多态执行看右边，eat 是 Cat 里的，所以 a.eat() 结果是 "猫吃鱼"

    System.out.println(a.age); // 40
    // System.out.println(a.weight);

    a.eat(); // 猫吃鱼
    // a.playGame();
  }
}
