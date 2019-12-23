package com.xincl.myCollection;
/**
 * 手写一个属于自己的ArrayList 容器，实际工作中不怎么会使用到
 * 但是可以进行练手，加强对底层代码的实现和温习前面的知识
 * 增加remove方法
 * 还有其它方法，size,isEmpty
 * @author xincl
 *
 */
public class SxtArrayList05<E> {
      private Object[] elementData;
      private int size;
      
      private static final int DEAFULT_CAPACITY = 10;
      
      public SxtArrayList05() {
    	  elementData = new Object[DEAFULT_CAPACITY];
      }
      
      public SxtArrayList05(int capacity) {
    	  
    	  if(capacity<0) {
    		  throw new RuntimeException("数组长度不能为负数");
    	  }else if(capacity>0) {
    		  elementData = new Object[capacity];    		  
    	  }else {
    		  elementData = new Object[DEAFULT_CAPACITY];
    	  }
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
      
      public int size() {
    	  return size;
      }
      
      public boolean isEmpty() {
    	  return size == 0?true:false;
      }
      
      //get方法
      @SuppressWarnings("unchecked")
	public E get(int index) {
    	  checkIndex(index);
    	  return (E)elementData[index];
      }
      
      //set方法
      public void set(E element,int index) {
    	  checkIndex(index);
    	  elementData[index] = element;
      }
      
      //检验索引是否合法
      public void checkIndex(int index) {
    	  if(index<0||index>size-1) {
    		  throw new RuntimeException("索引不合法: "+index);
    	  }
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
      
      public void remove(E element) {
    	  for(int i=0;i<size;i++) {
    		  if(element.equals(get(i))) {
    			  remove(i);
    		  }
    	  }
      }
      
      public void remove(int index) {
    	  int elementData_Length = elementData.length-index-1;
    	  if(elementData_Length>0) {
    		  System.arraycopy(elementData, index+1, elementData, index, elementData_Length);
    	  }
    	  elementData[--size] = null;
      }
      
      public static void main(String[] args) {
		SxtArrayList05<String> s = new SxtArrayList05<>(20);

		for(int i=0;i<40;i++) {
			s.add("xincl"+i);
		}
        s.set("xincl0",0);		
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		s.remove("xincl6");
		System.out.println(s);
		System.out.println(s.get(0));
		System.out.println(s.size);
		System.out.println(s.isEmpty());
	}
      
}
