package com.xincl.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试表格数据的存储
 * 体会ORM思想
 * 每一行用一个JavaBean对象存储，多行存放到List或Map中
 * @author xincl
 *
 */
public class TestStoreData2 {
     public static void main(String[] args) {
		User u1 = new User(1001, "张三", 20000, "2005-10-15");
		User u2 = new User(1002, "李四", 320000, "2002-10-15");
		User u3 = new User(1003, "王五", 50000, "2050-11-11");
    	 
		//用List存放数据
		List<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		
		for(User u:list) {
			System.out.println(u);
		}
		
		//用Map存放数据
		System.out.println("----------这里是分割线-----------");
        Map<Integer,User> m = new HashMap<>();
        m.put(u1.getId(), u1);
        m.put(u2.getId(), u2);
        m.put(u3.getId(), u3);
        
        Set<Integer> keySet = m.keySet();
        for(Integer i:keySet) {
        	System.out.println(m.get(i));
        }
        
		
	}
     
     
     
}

class User{
	private int id;
	private String name;
	private double salary;
	private String hireDate;
	

	public User() {   //一个JavaBean中，必须要有get/set方法，和一个空的构造器
		super();
	}
	
	public User(int id, String name, double salary, String hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" , name: "+name+" , salary: "+salary+" , hireDate: "+hireDate+"\t";
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	
	
}






