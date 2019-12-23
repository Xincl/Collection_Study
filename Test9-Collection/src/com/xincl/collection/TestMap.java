package com.xincl.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap(Map的实现方法)的基本方法
 * @author xincl
 *
 */
public class TestMap {
      public static void main(String[] args) {
		
    	  Map<Integer,String> m1 = new HashMap<>();
    	  
    	  //为Map添加值
    	  m1.put(1, "one");
    	  m1.put(2, "two");
    	  m1.put(3, "three");
    	  
    	  //根据键对象得到元素
    	  System.out.println(m1.get(1));
    	  
    	  //Map的长度
    	  System.out.println(m1.size());
    	  
    	  //查看Map是否为空
    	  System.out.println(m1.isEmpty());
    	  
    	  //删除所有Map的值
//    	  m1.clear();
    	  
    	  //删除键对象所指的元素
//    	  m1.remove(2);
//    	  System.out.println(m1.get(2));
    	  
    	  //Map根据键值对来测试Map中是否含有键值对
    	  System.out.println(m1.containsKey(2));
    	  //根据键值对的值来测试Map中是否含有键值对
    	  System.out.println(m1.containsValue("three"));
    	  
    	  System.out.println(m1);
    	  
    	  
    	  //将m2（另一个Map）的所有值都放到m1中
    	  Map<Integer,String> m2 = new HashMap<>();
    	  m2.put(2, "four");
    	  m2.put(5, "five");
    	  
    	  //键不能重复，重复根据equals来进行比较，若重复了，会新的覆盖旧的
    	  m1.putAll(m2);
    	  System.out.println(m1);
    	  
    	  System.out.println(m1.get(1).equals(m2.get(2)));
    	  
    	  
	}
      
      
      
      
      
}
