package com.xincl.collection;
/**
 * ≤‚ ‘∑∫–Õ
 * @author xincl
 *
 */
public class TestGeneric {
    public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		
		mc.set("xincl", 0);
		
		String s = mc.get(0);
		
		System.out.println(s);
		
	}  
	
}
class MyCollection<E>{
	Object[] objs = new Object[10];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E)objs[index];
	}
}

