package com.xincl.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����Collections�������ʹ��
 * Collection�ǽӿڣ�Collections�ǹ�����
 * ע�⣡������Ҫ����
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
    	
    	Collections.shuffle(list);   //�������ڵ�Ԫ���������
    	System.out.println(list);
    
    	Collections.sort(list);      //�������ڵ�Ԫ�ؽ��е��������Զ����ʹ�ã�Comparable�ӿ�:compareTo();
    	System.out.println(list);
    	
    	System.out.println(Collections.binarySearch(list, "xincl:3"));  //ʹ���۰���ҽ���Ѱ��Ԫ��
    	
    	Collections.reverse(list);   //����
    	System.out.println(list);
    	

    	
    	
    }
}




