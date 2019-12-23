package com.xincl.myCollection;
/**
 * ��дһ�������Լ���ArrayList ������ʵ�ʹ����в���ô��ʹ�õ�
 * ���ǿ��Խ������֣���ǿ�Եײ�����ʵ�ֺ���ϰǰ���֪ʶ
 * ����set��get����
 * �Լ���������߽�ļ��
 * @author xincl
 *
 */
public class SxtArrayList04<E> {
      private Object[] elementData;
      private int size;
      
      private static final int DEAFULT_CAPACITY = 10;
      
      public SxtArrayList04() {
    	  elementData = new Object[DEAFULT_CAPACITY];
      }
      
      public SxtArrayList04(int capacity) {
    	  
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
      
      //get����
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
      
      public static void main(String[] args) {
		SxtArrayList04 s = new SxtArrayList04(20);

		for(int i=0;i<40;i++) {
			s.add("xincl"+i);
		}
        s.set("xincl0",0);		
		System.out.println(s);
		System.out.println(s.get(0));
	}
      
      
      
      
      
}
