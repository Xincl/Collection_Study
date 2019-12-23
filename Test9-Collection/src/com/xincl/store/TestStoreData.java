package com.xincl.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 测试用容器存放一个表格数据
 * ORM思想的简单实现，map表示一行数据，把多行数据即多个map放到list里面
 * @author xincl
 *
 */
public class TestStoreData {
     public static void main(String[] args) {
    	 
		Map<String,Object> row1 = new HashMap<>();
		row1.put("ID",1001);
		row1.put("name", "张三");
		row1.put("salary",20000);
		row1.put("time","2005-10-15");
		
		Map<String,Object> row2 = new HashMap<>();
		row2.put("ID",1002);
		row2.put("name", "李四");
		row2.put("salary",320000);
		row2.put("time","2002-10-15");
		
		Map<String,Object> row3 = new HashMap<>();
		row3.put("ID",1003);
		row3.put("name", "王五");
		row3.put("salary",50000);
		row3.put("time","2050-11-11");
		
		List<Map<String,Object>> table1 = new ArrayList<>();
		
		table1.add(row1);
		table1.add(row2); 
		table1.add(row3);
		
		for(Map<String,Object> row:table1) {
			Set<String> keySet = row.keySet();//keySet吧所有的Key放在一个Set集合里面，方便调用
			
			for(String key:keySet) {
				System.out.print(key+": "+row.get(key)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
