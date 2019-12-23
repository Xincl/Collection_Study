package com.xincl.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����HashMap(Map��ʵ�ַ���)�Ļ�������
 * @author xincl
 *
 */
public class TestMap {
      public static void main(String[] args) {
		
    	  Map<Integer,String> m1 = new HashMap<>();
    	  
    	  //ΪMap���ֵ
    	  m1.put(1, "one");
    	  m1.put(2, "two");
    	  m1.put(3, "three");
    	  
    	  //���ݼ�����õ�Ԫ��
    	  System.out.println(m1.get(1));
    	  
    	  //Map�ĳ���
    	  System.out.println(m1.size());
    	  
    	  //�鿴Map�Ƿ�Ϊ��
    	  System.out.println(m1.isEmpty());
    	  
    	  //ɾ������Map��ֵ
//    	  m1.clear();
    	  
    	  //ɾ����������ָ��Ԫ��
//    	  m1.remove(2);
//    	  System.out.println(m1.get(2));
    	  
    	  //Map���ݼ�ֵ��������Map���Ƿ��м�ֵ��
    	  System.out.println(m1.containsKey(2));
    	  //���ݼ�ֵ�Ե�ֵ������Map���Ƿ��м�ֵ��
    	  System.out.println(m1.containsValue("three"));
    	  
    	  System.out.println(m1);
    	  
    	  
    	  //��m2����һ��Map��������ֵ���ŵ�m1��
    	  Map<Integer,String> m2 = new HashMap<>();
    	  m2.put(2, "four");
    	  m2.put(5, "five");
    	  
    	  //�������ظ����ظ�����equals�����бȽϣ����ظ��ˣ����µĸ��Ǿɵ�
    	  m1.putAll(m2);
    	  System.out.println(m1);
    	  
    	  System.out.println(m1.get(1).equals(m2.get(2)));
    	  
    	  
	}
      
      
      
      
      
}
