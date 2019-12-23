package com.xincl.myCollection;
/**
 * ����HashMap
 * �Զ���һ��HashMap
 * @author xincl
 *
 */
public class SxtHashMap {
      
	Node2[] table; //λͰ���顣bucket array
	int size;      //��ŵļ�ֵ�Եĸ���
	
	public SxtHashMap() {
		table = new Node2[16];   //�����2��������
	}
	
	public void put(Object key,Object value) {
		//�������µĽڵ����
		Node2 newNode = new Node2();
		newNode.hash = myHashMap(key.hashCode(),table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];
		Node2 iterLast = null;
		boolean flag = false;
		
		if(temp==null) {
			//�˴�����Ԫ��Ϊ�գ���ֱ�ӽ��½ڵ�Ž�ȥ
			table[newNode.hash] = newNode;
			size++;
		}else {
			//�˴�����Ԫ�ز�Ϊ�գ��򽫶�Ӧ���������������ֵ���滻��û������ں���
			while(temp!=null) {
				
				//�ж�key�Ƿ��ظ������ظ���key��hash,next���䣬����value��ֵ
				if(temp.key.equals(key)) {
					System.out.println("key�ظ��ˣ���");
					temp.value = value;
					flag = true;
					break;
				}else {
					//��key���ظ����������һ��
					iterLast = temp;
					temp = temp.next;
				}
			}
			if(!flag) {   //���û�з����ظ����������ִ����һ��
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
	
	//��дtoString ����
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		
		//����bucket���飬��λͰ����
		for(int i=0;i<table.length;i++) {
			Node2 temp = table[i];
			
			//��������
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
//		System.out.println("hash in myHash:"+(v&(length-1)));   //ֱ��λ���㣬Ч�ʸ�
//		System.out.println("hash in myHash:"+(v%(length-1)));   //ȡģ���㣬Ч�ʵ�,����ֵ��λ���㲻һ��
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
