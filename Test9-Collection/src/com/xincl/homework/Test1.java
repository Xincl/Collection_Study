package com.xincl.homework;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	    public static void main(String[] args) {
	        Map<String, String> map = new HashMap<String, String>();
	        String s = "code";
	        map.put(s, "1");
	        map.put(s, "2");
	        System.out.println(map.size());
	}
}
