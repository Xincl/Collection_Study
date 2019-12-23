package com.xincl.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 测试用迭代器，遍历List.Set,Map
 * @author xincl
 *
 */
public class TestIterator {
    public static void main(String[] args) {
//    	 testIteratorList();
//    	 testIteratorSet();
    	testIteratorMap();
    	
	} 
    
    //用迭代器遍历List
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		for(Iterator<String> iter = list.iterator();iter.hasNext();) {
			String temp = iter.next();
			
			System.out.println(temp);
		}
	}

	//用迭代器遍历Set
	public static void testIteratorSet() {
		Set<String> set = new HashSet<>();
		
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		for(Iterator<String> iter = set.iterator();iter.hasNext();) {
			String temp  = iter.next();
			
			System.out.println(temp);
		}
		
		
		
	}
	
	//用迭代器遍历Map
	public static void testIteratorMap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(101,"xincl");
		map.put(102,"青鱼");
		map.put(103,"十七");
		
		//第一种遍历Map的方法
		Set<Entry<Integer,String>> ss = map.entrySet();	
		for(Iterator<Entry<Integer,String>> iter = ss.iterator();iter.hasNext();) {
			Entry<Integer,String> temp = iter.next();
			
			System.out.println(temp.getKey()+"--"+temp.getValue());
		}
		
		System.out.println("--------这里是分割线---------");
		//第二种遍历Map的方式
		Set<Integer> keySet = map.keySet();
		for(Iterator<Integer> iter = keySet.iterator();iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key+"--"+map.get(key));
		}
		
		
		
		
		
	}
	

}
