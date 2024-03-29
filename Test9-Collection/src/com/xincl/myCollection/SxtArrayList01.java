package com.xincl.myCollection;
/**
 * 手写一个属于自己的ArrayList 容器，实际工作中不怎么会使用到
 * 但是可以进行练手，加强对底层代码的实现和温习前面的知识
 * @author xincl
 *
 */
public class SxtArrayList01 {
      private Object[] elementData;
      private int size;
      
      private static final int DEAFULT_CAPACITY = 10;
      
      public SxtArrayList01() {
    	  elementData = new Object[DEAFULT_CAPACITY];
      }
      
      public SxtArrayList01(int capacity) {
    	  elementData = new Object[capacity];
      }
      
      public void add(Object obj) {
    	  elementData[size++] = obj;
      }
      
      public String toString() {
    	  
    	  StringBuilder sb = new StringBuilder();
    	  
    	  sb.append("[");
    	  for(int i=0;i<size;i++) {
    		  sb.append(elementData[i]+",");
    	  }
    	  sb.setCharAt(sb.length()-1, ']');
    	  
    	  return sb.toString();
      }
      
      public static void main(String[] args) {
		SxtArrayList01 s = new SxtArrayList01(20);
		s.add("aa");
		s.add("bb");
		
		System.out.println(s);
	}
      
      
      
      
      
      
      
      
      
      
      
      
}
