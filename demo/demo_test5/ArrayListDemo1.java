/*
  ArrayList 构造方法：
    public ArrayList(): 创建一个空的集合对象

  ArrayList 添加方法：
    public boolean add(E e): 将指定改的元素追加到此集合的末尾
    public void add(int index, E element): 在此集合中的指定位置插入指定的元素
  
  ArrayList 常用方法：
    public boolean remove(Object o): 删除指定的元素，返回删除是否成功
    public E remobe(int index): 删除指定索引处的元素，返回被删除的元素
    public E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
    public E get(int index): 返回指定索引处的元素
    public int size(): 返回集合中元素的个数
*/

package demo_test5;

import java.util.ArrayList;

public class ArrayListDemo1 {
  public static void main(String[] args) {
    // 创建集合
    ArrayList<String> array = new ArrayList<String>();

    // 添加元素
    array.add("hello");
    array.add("world");
    array.add("java");
    System.out.println("array:" + array);

    array.add(1, "javase");
    System.out.println("array:" + array);

    // array.add(5, "123"); // 索引越界报错：IndexOutOfBoundsException

    System.out.println("--------------------");

    // 删除元素
    System.out.println(array.remove("world"));
    System.out.println(array.remove("123"));
    System.out.println(array);

    System.out.println(array.remove(1));
    // System.out.println(array.remove(3)); // 索引越界报错：IndexOutOfBoundsException
    System.out.println(array);

    System.out.println("--------------------");

    // 修改元素
    System.out.println(array.set(1, "rewrite"));
    // System.out.println(array.set(3, "123")); // 索引越界报错：IndexOutOfBoundsException
    System.out.println(array);

    System.out.println("--------------------");

    // 获取指定索引元素
    System.out.println(array.get(1));
    // System.out.println(array.get(3)); // 索引越界报错：IndexOutOfBoundsException

    System.out.println("--------------------");

    // 获取集合中元素个数
    System.out.println(array.size());
  }
}
