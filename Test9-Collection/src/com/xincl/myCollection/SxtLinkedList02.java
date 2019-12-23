package com.xincl.myCollection;

/**
 * 自定义一个链表(双向链表)
 * 处理小的封装和增加泛型
 * @author xincl
 *
 */
public class SxtLinkedList02<E> {
    private Node first;
    private Node last;
    
    private int size = 0;
    
    //插入一个元素
    public void add(int index,E e) {
    	Node ins = new Node(e);
    	Node temp = getNode2(index);
    	
		if(index == size) {
			add(e);
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
			System.out.println("插入索引出错，插入无效");
		}
    }	
    
    //删除指定索引的元素
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
    		
    		if(index == 0) {  //删除元素为第一个元素时
    			first = down;
    		}
    		
    		if(index == size-1) {  //删除元素为最后一个元素时
    			last = up;
    		}
    		size--;
    	}
    	
    }
    
    //获取指定索引的元素
    public Object get(int index) {
    	
    	Node temp = getNode(index);
    
    	return temp!=null?temp.element:null;
    }
    
    //获得指定索引的节点
    public Node getNode(int index) {
    	if(index<0 || index>size-1) {
    		throw new RuntimeException("索引不合法"+index);
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

    //尾插法，使用获得节点
    public Node getNode2(int index) {
    	if(index<0 || index>size) {
    		throw new RuntimeException("索引不合法"+index);
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

    
    //增加元素
    public void add(E element) {
    	Node node = new Node(element);
    	
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
    
    //重写显示方法
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
		SxtLinkedList02<String> list = new SxtLinkedList02<>();
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
