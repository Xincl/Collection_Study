package com.xincl.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����ҵһ
 * @author xincl
 *
 */
public class Homework1 {
     public static void main(String[] args) {
		Books b1 = new Books(101, "ʮ���Ϊʲô", 59.5, "����������");
		Books b2 = new Books(102, "Χ��", 35, "�˽̳�����");
		Books b3 = new Books(103, "�����ӻ���", 29, "���ݳ�����");
		
		List<Books> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Books b:list) {
			System.out.println(b);
		}
		
		System.out.println("--------�����Ƿָ���---------");
		Map<Integer,Books> m = new HashMap<>();
		
		m.put(b1.getId(), b1);
		m.put(b2.getId(), b2);
		m.put(b3.getId(), b3);
		
		Set<Integer> keySet = m.keySet();
		for(Integer i:keySet) {
			System.out.println(m.get(i));
		}
		
		
		
	}
}

class Books{
	private int id;
	private String bName;
	private double price;
	private String press;
	
	public Books() {
		super();
	}

	public Books(int id, String bName, double price, String press) {
		super();
		this.id = id;
		this.bName = bName;
		this.price = price;
		this.press = press;
	}

   @Override
	public String toString() {
	   return "id: "+id+" , bName: "+bName+" , price: "+price+" , press: "+press+"\t";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}
	
	
	
}
 