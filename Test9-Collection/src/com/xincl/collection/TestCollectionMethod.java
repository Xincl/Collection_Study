package com.xincl.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ����Collection�ķ�����ע�⣺��ΪList��Set����Collection�Ľӿڣ��������Ƕ���ʵ��Collection�ķ���
 * ����arraylist�������������ʽ
 * @author xincl
 *
 */
public class TestCollectionMethod {
     public static void main(String[] args) {
//            testBasic();
//    	      test2();
    	   test3();
	    
		
		
	}
     
     //���Զ������ڲ����ķ���
     public static void testBasic() {
		Collection<String> c = new ArrayList<>();
		
	    System.out.println(c.size());  //�ж�������С�����ж���Ԫ��
	    System.out.println(c.isEmpty()); //�ж������Ƿ�Ϊ��
	    
	    c.add("xincl");
	    c.add("best");
	    System.out.println(c.toString());
	    System.out.println(c.size());  
	    
	    Object[] obj = c.toArray();
	    System.out.println(Arrays.toString(obj));
	    System.out.println(obj.length);
	    
	    System.out.println(c.contains("xincl7")); //�ж��Ƿ��и���Ԫ��
	    
	    c.remove("best");    //ɾ��һ��Ԫ�أ���������
	    System.out.println(c);
	    
	    c.clear();  //ɾ������Ԫ��
	    System.out.println(c);
     }
     
     //���Զ������Ĳ������������ԶԸ���������ȡ�����޸�ֻ�ڱ�����
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
    	 System.out.println(c1.containsAll(c2)); //����c1�Ƿ���c2���е�Ԫ��
//    	 System.out.println(c1.removeAll(c2));   //����ȥ������c1����c2�н�����Ԫ��
//    	 System.out.println(c1);
//    	 System.out.println(c1.retainAll(c2));   //����ȥ������c1����c2û�н�����Ԫ��
//    	 System.out.println(c1);
    	 System.out.println(c1.addAll(c2));      //���Խ�c2����Ԫ�ظ��Ƶ�c1
    	 System.out.println(c1);
     }
     
     public static void test3() {
        
    	 List<String> list = new ArrayList<>();
    	 
    	 //ֱ���ں������Ԫ��
    	 list.add("A");
    	 list.add("B");
    	 list.add("C");
    	 list.add("D");
    	 
    	 System.out.println(list.toString());
    	 
    	 //������λ�����Ԫ�أ�����֮���Ԫ��������
    	 list.add(2, "xincl");
    	 System.out.println(list);
    	 
    	 //ȥ��������ָʾ��λ�ã�����֮���Ԫ����ǰ��
    	 list.remove(2);
    	 System.out.println(list);
    	 
    	 //��ָ��������λ�ø�ֵ�ɶ�Ӧ��Ԫ��
    	 list.set(2, "xincl");
    	 System.out.println(list);
    	 
    	 //������Ԫ�غ��������Ԫ��
    	 list.add("B");
    	 list.add("A");
    	 System.out.println(list);
    	 
    	 System.out.println(list.indexOf("B"));  //�жϵ�һ�����ֵ�Ҫ���ҵ�Ԫ��
    	 System.out.println(list.lastIndexOf("B"));  //�ж����һ�����ֵ�Ҫ���ҵ�Ԫ��
    	 
    	 
     }
     
     
     
     
     
}
