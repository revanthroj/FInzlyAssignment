package com.currencypairs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\revan\\eclipse-workspace\\CurrencyPair\\src\\CurrencyPairs.csv";
		String line =  null;
		String [] col = null;
		String cols = null;
		ArrayList<Data> c = new ArrayList<>();
		try (BufferedReader bf = new BufferedReader(new FileReader(filepath))) {
			while((line = bf.readLine()) != null) {
				col = line.split(",");
				cols = col[0]+col[1];
				c.add(new Data(col [0],col[1],col[2],col[3],col[4],col[5],cols));
				Collections.sort(c,new CurrencyPairComparator());
			}
		}
//		sortDate(c);
//		for(Data s: c) {
//			System.out.println("\n"+s);
//		}
		sortCurrencyPair(c);
		for(Data x: c) {
			System.out.println("\n"+x);
		}
		retriveData(c);	

		
	}
	public static void retriveData(ArrayList<Data> c) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the Currency Pairs");
			String pairs = input.next();
			for(Data cp:c) {
				if(pairs.equals(cp.getCcy1()+cp.getCcy2())) {
					System.out.println(cp);
				}
			}
		}
		
		
	}
	public static void sortDate(ArrayList<Data> c) {
		Collections.sort(c,new DateComparator());
	}
	public static void sortCurrencyPair(ArrayList<Data> c) {
		Collections.sort(c,new CurrencyPairComparator());
	}

}


