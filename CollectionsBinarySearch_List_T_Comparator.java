package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsBinarySearch_List_T_Comparator {

	public static void main(String[] args) {
		
		List<String> sortedList=new ArrayList<>();
		sortedList.add("apple");
		sortedList.add("bannana");
		sortedList.add("cherry");
		sortedList.add("grape");
			String key="cherry";
			int index=Collections.binarySearch(sortedList, key, Comparator.naturalOrder());
			System.out.println(index);
	}
}
