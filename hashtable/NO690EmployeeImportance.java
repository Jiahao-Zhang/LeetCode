package pers.jiahao.leetcode.hashtable;

import java.util.HashMap;
import java.util.List;

public class NO690EmployeeImportance {
	class Employee {
	    // It's the unique id of each node;
	    // unique id of this employee
	    public int id;
	    // the importance value of this employee
	    public int importance;
	    // the id of direct subordinates
	    public List<Integer> subordinates;
	};
	
	class Solution {
	    int sum = 0;
	    public int getImportance(List<Employee> employees, int id) {
	        if(employees==null||employees.size()==0){
	            return 0;
	        }
	        HashMap<Integer,Employee> map = new HashMap<>();
	        for(int i = 0;i<employees.size();i++){
	            map.put(employees.get(i).id,employees.get(i));
	        }
	        sum = map.get(id).importance;
	        for(int i = 0;i<map.get(id).subordinates.size();i++){
	            getImportance1(map.get(id).subordinates.get(i),map);
	        }
	        int importance = sum;
	        return importance;
	    }
	    public void getImportance1(int id,HashMap<Integer,Employee> map){
	        sum = sum+map.get(id).importance;
	        if(map.get(id).subordinates.size()==0){
	            return;
	        }
	        for(int i = 0;i<map.get(id).subordinates.size();i++){
	            getImportance1(map.get(id).subordinates.get(i),map);
	        }
	        
	    }
	}

}
