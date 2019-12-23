package com.xincl.myCollection;
/**
 * ����HashMap
 * �Զ���һ��HashMap
 * �з���
 * @author xincl
 *
 */
public class SxtHashMap2<K,V> {
      
	Node3<K,V>[] table; //λͰ���顣bucket array
	int size;      //��ŵļ�ֵ�Եĸ���
	
	@SuppressWarnings("unchecked")
	public SxtHashMap2() {
		table = new Node3[16];   //�����2��������
	}
	
	public void put(K key,V value) {
		//�������µĽڵ����
		Node3<K,V> newNode = new Node3<K,V>();
		newNode.hash = myHashMap(key.hashCode(),table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node3<K,V> temp = table[newNode.hash];
		Node3<K,V> iterLast = null;
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
	
	public V get(K key) {
	    int hash = myHashMap(key.hashCode(), table.length);
	    V value = null;
	    
	    if(table[hash]!=null) {
	    Node3<K,V> temp = table[hash];
	     while(temp!=null) {
	    	if(temp.key.equals(key)) {
	    		value = (V)temp.value;
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
			Node3<K,V> temp = table[i];
			
			//��������
			while(temp!=null) {
				sb.append(temp.key+": "+temp.value+",");
				
				temp = temp.next;
			}
		}
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
		
	}
	
	public int myHashMap(int v,int length) {
		System.out.println("hash in myHash:"+(v&(length-1)));   //ֱ��λ���㣬Ч�ʸ�
		System.out.println("hash in myHash:"+(v%(length-1)));   //ȡģ���㣬Ч�ʵ�,����ֵ��λ���㲻һ��
		return v&(length-1);
	}
	
	public static void main(String[] args) {
		SxtHashMap2<Integer,String> m = new SxtHashMap2<>();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "sssss");
		
		m.put(53, "xincl");
		m.put(85, "01010");
		m.put(69, "qwe");
		
		System.out.println(m.get(85));
		
		System.out.println(m.toString());
	}
	
	
	
}
