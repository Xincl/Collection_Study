package com.xincl.myCollection;
/**
 * ��дһ�������Լ���ArrayList ������ʵ�ʹ����в���ô��ʹ�õ�
 * ���ǿ��Խ������֣���ǿ�Եײ�����ʵ�ֺ���ϰǰ���֪ʶ
 * ����remove����
 * ��������������size,isEmpty
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
    		  throw new RuntimeException("���鳤�Ȳ���Ϊ����");
    	  }else if(capacity>0) {
    		  elementData = new Object[capacity];    		  
    	  }else {
    		  elementData = new Object[DEAFULT_CAPACITY];
    	  }
      }
      
      public void add(E element) {
    	  //ʲôʱ�����ݣ���size�������鳤��ʱ
    	  if(size == elementData.length) {    		  
    		  //��ô���ݣ�������������Ŀ���
    	     Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10->10+10/2
    	     System.arraycopy(elementData, 0, newArray, 0, elementData.length);//���������������
    	     elementData = newArray; 	//��������ĵ�ַ���������飬Ȼ�����
    	  }
    	  elementData[size++] = element;
      }
      
      public int size() {
    	  return size;
      }
      
      public boolean isEmpty() {
    	  return size == 0?true:false;
      }
      
      //get����
      @SuppressWarnings("unchecked")
	public E get(int index) {
    	  checkIndex(index);
    	  return (E)elementData[index];
      }
      
      //set����
      public void set(E element,int index) {
    	  checkIndex(index);
    	  elementData[index] = element;
      }
      
      //���������Ƿ�Ϸ�
      public void checkIndex(int index) {
    	  if(index<0||index>size-1) {
    		  throw new RuntimeException("�������Ϸ�: "+index);
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
