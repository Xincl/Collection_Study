package com.xincl.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 测试Collection的方法，注意：因为List和Set都有Collection的接口，所以他们都会实现Collection的方法
 * 测试arraylist的有序的索引方式
 * @author xincl
 *
 */
public class TestCollectionMethod {
     public static void main(String[] args) {
//            testBasic();
//    	      test2();
    	   test3();
	    
		
		
	}
     
     //测试对容器内操作的方法
     public static void testBasic() {
		Collection<String> c = new ArrayList<>();
		
	    System.out.println(c.size());  //判断容器大小（内有多少元素
	    System.out.println(c.isEmpty()); //判断容器是否为空
	    
	    c.add("xincl");
	    c.add("best");
	    System.out.println(c.toString());
	    System.out.println(c.size());  
	    
	    Object[] obj = c.toArray();
	    System.out.println(Arrays.toString(obj));
	    System.out.println(obj.length);
	    
	    System.out.println(c.contains("xincl7")); //判断是否含有该子元素
	    
	    c.remove("best");    //删除一个元素，根据内容
	    System.out.println(c);
	    
	    c.clear();  //删除所有元素
	    System.out.println(c);
     }
     
     //测试对容器的操作方法，可以对复数容器读取，但修改只在本容器
     public static void test2() {
    	 Collection<String> c1 = new ArrayList<>();
    	 Collection<String> c2 = new ArrayList<>();
    	 
    	 c1.add("xincl");
    	 c1.add("best");
    	 c2.add("are");
    	 c2.add("best");
    	 
    	 System.out.println(c1);
    	 System.out.println(c2);
    	 
    	 System.out.println("############");
    	 System.out.println(c1.containsAll(c2)); //测试c1是否含有c2所有的元素
//    	 System.out.println(c1.removeAll(c2));   //测试去除所有c1中与c2有交集的元素
//    	 System.out.println(c1);
//    	 System.out.println(c1.retainAll(c2));   //测试去除所有c1中与c2没有交集的元素
//    	 System.out.println(c1);
    	 System.out.println(c1.addAll(c2));      //测试将c2所有元素复制到c1
    	 System.out.println(c1);
     }
     
     public static void test3() {
        
    	 List<String> list = new ArrayList<>();
    	 
    	 //直接在后面添加元素
    	 list.add("A");
    	 list.add("B");
    	 list.add("C");
    	 list.add("D");
    	 
    	 System.out.println(list.toString());
    	 
    	 //在索引位置添加元素，索引之后的元素往后移
    	 list.add(2, "xincl");
    	 System.out.println(list);
    	 
    	 //去掉索引所指示的位置，所以之后的元素往前移
    	 list.remove(2);
    	 System.out.println(list);
    	 
    	 //将指定的索引位置赋值成对应的元素
    	 list.set(2, "xincl");
    	 System.out.println(list);
    	 
    	 //在已有元素后面加如新元素
    	 list.add("B");
    	 list.add("A");
    	 System.out.println(list);
    	 
    	 System.out.println(list.indexOf("B"));  //判断第一个出现的要查找的元素
    	 System.out.println(list.lastIndexOf("B"));  //判断最后一个出现的要查找的元素
    	 
    	 
     }
     
     
     
     
     
}
