package com.xincl.myCollection;

import java.util.HashMap;

/**
 * 自定义一个HashMap
 * @author xincl
 *
 */
public class SxtHashSet {

	@SuppressWarnings("rawtypes")
	HashMap map;
	private static final Object PRESENT = new Object();
	
	@SuppressWarnings("rawtypes")
	public SxtHashSet() {
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	@SuppressWarnings("unchecked")
	public void add(Object o) {
		map.put(o,PRESENT);
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    
	    sb.append("[");
	    
	    for(Object key:map.keySet()) {
	    	sb.append(key+",");
	    }
	    
	    sb.setCharAt(sb.length()-1, ']');
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtHashSet set = new SxtHashSet();
		set.add("aaaa");
		set.add("bbbb");
		set.add("cccc");
		
		System.out.println(set);
	}
	
	
	
	
	
}
