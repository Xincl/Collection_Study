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
 * �����õ�����������List.Set,Map
 * @author xincl
 *
 */
public class TestIterator {
    public static void main(String[] args) {
//    	 testIteratorList();
//    	 testIteratorSet();
    	testIteratorMap();
    	
	} 
    
    //�õ���������List
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

	//�õ���������Set
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
	
	//�õ���������Map
	public static void testIteratorMap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(101,"xincl");
		map.put(102,"����");
		map.put(103,"ʮ��");
		
		//��һ�ֱ���Map�ķ���
		Set<Entry<Integer,String>> ss = map.entrySet();	
		for(Iterator<Entry<Integer,String>> iter = ss.iterator();iter.hasNext();) {
			Entry<Integer,String> temp = iter.next();
			
			System.out.println(temp.getKey()+"--"+temp.getValue());
		}
		
		System.out.println("--------�����Ƿָ���---------");
		//�ڶ��ֱ���Map�ķ�ʽ
		Set<Integer> keySet = map.keySet();
		for(Iterator<Integer> iter = keySet.iterator();iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key+"--"+map.get(key));
		}
		
		
		
		
		
	}
	

}
