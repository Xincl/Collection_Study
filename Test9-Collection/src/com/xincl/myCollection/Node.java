package com.xincl.myCollection;
/**
 * һ��node�ڵ�
 * @author xincl
 *
 */
public class Node {
    
	Node pervious;   //��һ���ڵ�
	Node next;       //��һ���ڵ�
	Object element;  //�������
	public Node(Node pervious, Node next, Object element) {
		super();
		this.pervious = pervious;
		this.next = next;
		this.element = element;
	}
	public Node(Object element) {
		super();
		this.element = element;
	}
	
	
	 
	
}
