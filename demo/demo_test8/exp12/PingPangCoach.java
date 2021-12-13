package demo_test8.exp12;

public class PingPangCoach extends Coach implements SpeakEnglish {

  public PingPangCoach() {};

  public PingPangCoach(String name, int age) {
    super(name, age);
  }

  @Override
  public void eat() {
    System.out.println("乒乓球教练吃饭");
  }

  @Override
  public void teach() {
    System.out.println("乒乓球教练教乒乓球");
  }

  @Override
  public void speak() {
    System.out.println("乒乓球教练说英语");
  }
}
