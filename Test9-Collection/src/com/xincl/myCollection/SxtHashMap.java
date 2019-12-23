package com.xincl.myCollection;
/**
 * 测试HashMap
 * 自定义一个HashMap
 * @author xincl
 *
 */
public class SxtHashMap {
      
	Node2[] table; //位桶数组。bucket array
	int size;      //存放的键值对的个数
	
	public SxtHashMap() {
		table = new Node2[16];   //定义成2的整数幂
	}
	
	public void put(Object key,Object value) {
		//定义了新的节点对象
		Node2 newNode = new Node2();
		newNode.hash = myHashMap(key.hashCode(),table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		Node2 iterLast = null;
		boolean flag = false;
		
		if(temp==null) {
			//此处数组元素为空，则直接将新节点放进去
			table[newNode.hash] = newNode;
			size++;
		}else {
			//此处数组元素不为空，则将对应链表遍历，有相似值则替换，没有则接在后面
			while(temp!=null) {
				
				//判断key是否重复，若重复，key，hash,next不变，更改value的值
				if(temp.key.equals(key)) {
					System.out.println("key重复了！！");
					temp.value = value;
					flag = true;
					break;
				}else {
					//若key不重复，则遍历下一个
					iterLast = temp;
					temp = temp.next;
				}
			}
			if(!flag) {   //如果没有发生重复的情况，则执行这一块
				iterLast.next = newNode;
				size++;
			}
		}
	}
	
	public Object get(Object key) {
	    int hash = myHashMap(key.hashCode(), table.length);
	    Object value = null;
	    
	    if(table[hash]!=null) {
	    Node2 temp = table[hash];
	     while(temp!=null) {
	    	if(temp.key.equals(key)) {
	    		value = temp.value;
	    		break;
	    	}else {
	    		temp = temp.next;
	    	}    	
	      }
	    }
	    return value;
	    
	}
	
	//重写toString 方法
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		
		//遍历bucket数组，即位桶数组
		for(int i=0;i<table.length;i++) {
			Node2 temp = table[i];
			
			//遍历链表
			while(temp!=null) {
				sb.append(temp.key+": "+temp.value+",");
				
				temp = temp.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
		
	}
	
	public void remove(Object key) {
		int hash = myHashMap(key.hashCode(), table.length);
		
		if(table[hash]!=null) {
			Node2 temp = table[hash];
			Node2 change = null;
			Node2 perious = null;
			
			while(temp!=null) {
				
				if(temp.key.equals(key)) {
					
					change = temp.next;
					if(perious!=null) {
					perious.next = change;
					}else {
					   table[hash] = null;
					}
					temp = null;
					break;
					
				}else {
					perious = temp;
					temp = temp.next;
				}
				
			}
		}
		
		
	}
	
	public int myHashMap(int v,int length) {
//		System.out.println("hash in myHash:"+(v&(length-1)));   //直接位运算，效率高
//		System.out.println("hash in myHash:"+(v%(length-1)));   //取模运算，效率低,计算值与位运算不一样
		return v&(length-1);
	}
	
	public static void main(String[] args) {
		SxtHashMap m = new SxtHashMap();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "sssss");
		
		m.put(53, "xincl");
		m.put(85, "01010");
		m.put(69, "qwe");
		
//		System.out.println(m.get(20));
		System.out.println(m.toString());
		m.remove(30);
		
		System.out.println(m.toString());
		
	}
	
	
	
}
