package com.xincl.myCollection;
/**
 * ��дһ�������Լ���ArrayList ������ʵ�ʹ����в���ô��ʹ�õ�
 * ���ǿ��Խ������֣���ǿ�Եײ�����ʵ�ֺ���ϰǰ���֪ʶ
 * ������������
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
    	  //ʲôʱ�����ݣ���size�������鳤��ʱ
    	  if(size == elementData.length) {
    		  //��ô���ݣ�������������Ŀ���
    		  
    	     Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10->10+10/2
    	     System.arraycopy(elementData, 0, newArray, 0, elementData.length);//���������������
    	     elementData = newArray; 	//��������ĵ�ַ���������飬Ȼ�����
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
