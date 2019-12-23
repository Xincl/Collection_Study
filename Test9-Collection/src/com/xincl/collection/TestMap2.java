package com.xincl.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体测试Map类方法
 * @author xincl
 *
 */
public class TestMap2 {
    public static void main(String[] args) {
		Employee e1 = new Employee(1001, "xincl", 50000);
		Employee e2 = new Employee(1002, "aaaaa", 20020);
		Employee e3 = new Employee(1003, "bbbbb", 12000);
		
		Map<Integer,Employee> mp = new HashMap<>();
		
		mp.put(1001, e1);
		mp.put(1002, e2);
		mp.put(1003, e3);
		
		System.out.println(mp);
		
	}  
}

class Employee{
	private int id;
	private String enname;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.enname = name;
		this.salary = salary;
	}
	
	@Override
		public String toString() {
			return "id: "+id+"  "+"name: "+enname+" "+"salary: "+salary+"\n";
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return enname;
	}

	public void setName(String name) {
		this.enname = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}