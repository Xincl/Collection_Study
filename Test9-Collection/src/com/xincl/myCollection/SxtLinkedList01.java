package com.xincl.myCollection;

import java.util.LinkedList;

/**
 * �Զ���һ������
 * @author xincl
 *
 */
public class SxtLinkedList01 {
    private Node first;
    private Node last;
    
    private int size = 0;
    
    //����һ��Ԫ��
    public void add(int index,Object obj) {
    	Node ins = new Node(obj);
    	Node temp = getNode2(index);
    	
		if(index == size) {
			add(obj);
		}
		else if((temp!=null) && (index <= size)) {
    		Node up = temp.pervious;
    		
    		ins.next = temp;
    	    temp.pervious = ins; 
    	    
    		if(up!=null) {
    			up.next = ins;
    			ins.pervious = up;
    		}    			   	
    			
    		if(index==0) {
    			first = ins;
    		}


//    		if(index==size-1) {
//    			temp.next = ins;
//    			ins.pervious = temp;
//    			ins.next = null;
//    		}
    		size++;
    	} 
		if(index > size) {
			System.out.println("������������������Ч");
		}
    }	
    
    //ɾ��ָ��������Ԫ��
    public void remove(int index) {
    	Node temp = getNode(index);
    	
    	if(temp!=null) {
    		Node up = temp.pervious;
    		Node down = temp.next;
    		
    		if(up!=null){
    			up.next = down;
    		}
    		
    		if(down!=null) {
    			down.pervious = up;
    		}
    		
    		if(index == 0) {  //ɾ��Ԫ��Ϊ��һ��Ԫ��ʱ
    			first = down;
    		}
    		
    		if(index == size-1) {  //ɾ��Ԫ��Ϊ���һ��Ԫ��ʱ
    			last = up;
    		}
    		size--;
    	}
    	
    }
    
    //��ȡָ��������Ԫ��
    public Object get(int index) {
    	if(index<0||index>size-1) {
    		Node temp = getNode(index);
    		
    		return temp!=null?temp.element:null;
    	}else {
    		throw new RuntimeException("�����������Ϸ��� "+index);
    	}
    }
    
    //���ָ�������Ľڵ�
    public Node getNode(int index) {
    	if(index<0 || index>size-1) {
    		throw new RuntimeException("�������Ϸ�"+index);
    	}
    	
    	Node temp = null;
    	if(index<=(size>>1)) {
    		temp = first;
    		for(int i=0;i<index;i++) {
    			temp = temp.next;
    		}	
    	}else {
    		temp = last;
    		for(int i=size-1;i>index;i--) {
    			temp = temp.pervious;
    		}
    	}
    	return temp; 
    }
    

    //β�巨��ʹ�û�ýڵ�
    public Node getNode2(int index) {
    	if(index<0 || index>size) {
    		throw new RuntimeException("�������Ϸ�"+index);
    	}
    	
    	Node temp = null;
    	if(index<=(size>>1)) {
    		temp = first;
    		for(int i=0;i<index;i++) {
    			temp = temp.next;
    		}	
    	}else {
    		temp = last;
    		for(int i=size-1;i>index;i--) {
    			temp = temp.pervious;
    		}
    	}
    	return temp; 
    }

    
    //����Ԫ��
    public void add(Object obj) {
    	Node node = new Node(obj);
    	
    	if(first == null) {
    		node.pervious = null;
    		node.next = null;
    		
    		first = node;
    		last = node;
    	}else {
    		node.pervious = last;
    		node.next = null;
    		
    		last.next = node;
    		last = node;
    	}
    	size++;
    	
    }
    
    //��д��ʾ����
    public String toString() {
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("[");
    	Node temp = first;
    	while(temp!=null) {
    		sb.append(temp.element+",");
    		temp = temp.next;
    	}
    	sb.setCharAt(sb.length()-1, ']');
    	return sb.toString();
    }
    
    
    public static void main(String[] args) {
		SxtLinkedList01 list = new SxtLinkedList01();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println(list);
//		System.out.println(list.get(3));
//		list.remove(0);
//		System.out.println(list);
		list.add(5, "2");
		System.out.println(list);
//		LinkedList list1;
		
	}
    
}
