package com.xincl.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet的用法
 * @author xincl
 *
 */
public class TestTreeSet {
    public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		
		s1.add(300);
		s1.add(100);
		s1.add(200);
		
		//按照元素递增的方法来排序输出
		for(Integer i:s1) {
			System.out.println(i);
		}
		
		Set<Emp2> s2 = new TreeSet<>();
		
		s2.add(new Emp2(101,"xincl",50000));
		s2.add(new Emp2(103,"aaaaa",30000));
		s2.add(new Emp2(102,"bbbbb",40000));
		s2.add(new Emp2(105,"bbbbb",50000));
		
		System.out.println(s2);
		
	}
}
class Emp2 implements Comparable<Emp2>{
	int id;
	String name;
	double salary;
	
	public Emp2(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id："+id+" "+"name: "+name+" "+"salary："+salary+"\n";
	}
	
	@Override
	public int compareTo(Emp2 o) {    //负数：小于  零：等于  正数：大于
		
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
