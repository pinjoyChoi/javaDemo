package demo_test8.exp9;

public class Demo {
  public static void main(String[] args) {
    Inter i = new InterImpl();
    // i.num = 20;
    System.out.println(i.num);
    System.out.println(Inter.num);
  }
}
