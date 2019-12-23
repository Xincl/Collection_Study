package com.xincl.myCollection;
/**
 * ��дһ�������Լ���ArrayList ������ʵ�ʹ����в���ô��ʹ�õ�
 * ���ǿ��Խ������֣���ǿ�Եײ�����ʵ�ֺ���ϰǰ���֪ʶ
 * ���ӷ���
 * @author xincl
 *
 */
public class SxtArrayList02<E> {
      private Object[] elementData;
      private int size;
      
      private static final int DEAFULT_CAPACITY = 10;
      
      public SxtArrayList02() {
    	  elementData = new Object[DEAFULT_CAPACITY];
      }
      
      public SxtArrayList02(int capacity) {
    	  elementData = new Object[capacity];
      }
      
      public void add(E element) {
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
		SxtArrayList02 s = new SxtArrayList02(20);
		s.add("aa");
		s.add("bb");
		
		System.out.println(s);
	}
      
      
      
      
      
      
      
      
      
      
      
      
}
