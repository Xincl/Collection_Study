package com.xincl.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreemMap�ķ���
 * @author xincl
 *
 */
public class TestTreeMap {
    public static void main(String[] args) {
		Map<Integer,String> treemap1 = new TreeMap<>();
		
		treemap1.put(100, "aa");
		treemap1.put(300, "cc");
		treemap1.put(200, "bb");
	 
		//����keyֵ�ĵ������������
		for(Integer key:treemap1.keySet()) {
			System.out.println(key+"----"+treemap1.get(key));
		}
		
		Map<Emp,String> treemap2 = new TreeMap<>();
		
		treemap2.put(new Emp(101,"xincl",50000), "xincl��һ������Ա");
		treemap2.put(new Emp(103,"aaaaa",30000), "aaaaa��һ������Ա");
		treemap2.put(new Emp(102,"bbbbb",40000), "bbbbb��һ��ʿ��");
		treemap2.put(new Emp(105,"bbbbb",50000), "ccccc��һ������");
		
		
		//����keyֵ�ĵ������������
		for(Emp key:treemap2.keySet()) {
			System.out.println(key+"----"+treemap2.get(key));
		}
		
	}
    
}
class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id��"+id+" "+"name: "+name+" "+"salary��"+salary;
	}
	
	@Override
	//��дcompareTo����������Ķ����뵱ǰ�Ķ�����Ƚϣ������ǰ�棬С���ں���
	public int compareTo(Emp o) {    //������С��  �㣺����  ����������
		
		if(this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary) {
			return -1;
		}else {
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
		
	}


	
	
	
}




