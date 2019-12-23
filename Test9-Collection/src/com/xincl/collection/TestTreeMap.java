package com.xincl.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * 测试TreemMap的方法
 * @author xincl
 *
 */
public class TestTreeMap {
    public static void main(String[] args) {
		Map<Integer,String> treemap1 = new TreeMap<>();
		
		treemap1.put(100, "aa");
		treemap1.put(300, "cc");
		treemap1.put(200, "bb");
	 
		//根据key值的递增排序输出了
		for(Integer key:treemap1.keySet()) {
			System.out.println(key+"----"+treemap1.get(key));
		}
		
		Map<Emp,String> treemap2 = new TreeMap<>();
		
		treemap2.put(new Emp(101,"xincl",50000), "xincl是一个程序员");
		treemap2.put(new Emp(103,"aaaaa",30000), "aaaaa是一个飞行员");
		treemap2.put(new Emp(102,"bbbbb",40000), "bbbbb是一个士兵");
		treemap2.put(new Emp(105,"bbbbb",50000), "ccccc是一个将军");
		
		
		//根据key值的递增排序输出了
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
		return "id："+id+" "+"name: "+name+" "+"salary："+salary;
	}
	
	@Override
	//重写compareTo方法，传入的对象与当前的对象相比较，大的在前面，小的在后面
	public int compareTo(Emp o) {    //负数：小于  零：等于  正数：大于
		
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




