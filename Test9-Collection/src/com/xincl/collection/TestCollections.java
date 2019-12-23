package com.xincl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试Collections辅助类的使用
 * Collection是接口，Collections是工具类
 * 注意！！！不要混淆
 * @author xincl
 *
 */
public class TestCollections {
    public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
    	
    	for(int i=0;i<10;i++) {
    		list.add("xincl:"+i);
    	}
    	
    	System.out.println(list);
    	
    	Collections.shuffle(list);   //对容器内的元素随机排列
    	System.out.println(list);
    
    	Collections.sort(list);      //对容器内的元素进行递增排序。自定类的使用，Comparable接口:compareTo();
    	System.out.println(list);
    	
    	System.out.println(Collections.binarySearch(list, "xincl:3"));  //使用折半查找进行寻找元素
    	
    	Collections.reverse(list);   //逆序
    	System.out.println(list);
    	

    	
    	
    }
}




