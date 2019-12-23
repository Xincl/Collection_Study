package com.xincl.myCollection;
/**
 * 手写一个属于自己的ArrayList 容器，实际工作中不怎么会使用到
 * 但是可以进行练手，加强对底层代码的实现和温习前面的知识
 * 增加数组扩容
 * @author xincl
 *
 */
public class SxtArrayList03<E> {
      private Object[] elementData;
      private int size;
      
      private static final int DEAFULT_CAPACITY = 10;
      
      public SxtArrayList03() {
    	  elementData = new Object[DEAFULT_CAPACITY];
      }
      
      public SxtArrayList03(int capacity) {
    	  elementData = new Object[capacity];
      }
      
      public void add(E element) {
    	  //什么时候扩容？当size等于数组长度时
    	  if(size == elementData.length) {
    		  //怎么扩容？本质上是数组的拷贝
    		  
    	     Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10->10+10/2
    	     System.arraycopy(elementData, 0, newArray, 0, elementData.length);//拷贝到更大的数组
    	     elementData = newArray; 	//把新数组的地址赋给老数组，然后回收
    	  }
    	  elementData[size++] = element;
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
		SxtArrayList03 s = new SxtArrayList03(20);

		for(int i=0;i<40;i++) {
			s.add("xincl"+i);
		}
		System.out.println(s);
	}
      
      
      
      
      
      
}
