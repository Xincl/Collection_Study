package com.xincl.myCollection;
/**
 * 一个node节点
 * @author xincl
 *
 */
public class Node {
    
	Node pervious;   //上一个节点
	Node next;       //下一个节点
	Object element;  //存放数据
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
