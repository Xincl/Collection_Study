package com.xincl.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试HashSet的方法使用
 * 特性是无序，不可重复
 * 与ArrayList(有顺序，可重复的）不一样 ，
 * @author xincl
 *
 */
public class TestHashSet {
     public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		
		s1.add("aaa");
		s1.add("bbb");
		s1.add("ccc");
		s1.add("ddd");
		s1.add("aaa");  //无序
		System.out.println(s1);
	
		s1.remove("ccc");
		System.out.println(s1);
		
		System.out.println(s1.contains("bbb"));
		
		Set<String> s2 = new HashSet<>();
		
		s2.add("xincl");
		s2.addAll(s1);
		System.out.println(s2);
		
//		s2.removeAll(s1);
//		System.out.println(s2);
		
		s2.retainAll(s1);
		System.out.println(s2);
		
		
		
		
		
	}
     
     
     
     
     
     
}
