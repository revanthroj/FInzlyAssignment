package com.currencypairs;

import java.util.Comparator;

public class DateComparator implements Comparator<Data>{

	@Override
	public int compare(Data obj1, Data obj2) {
		// TODO Auto-generated method stub
		return obj1.getLastUpdatedTime().compareTo(obj2.getLastUpdatedTime());
	}
	

}
