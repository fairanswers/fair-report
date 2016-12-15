package com.fairanswers.report.examples;

import com.fairanswers.report.JSONFormatter;
import com.fairanswers.report.Row;
import com.fairanswers.report.Section;
import com.fairanswers.report.Table;

public class SimpleExample {
	public static void main(String [] args){
		Table t = new Table();
		makeTable(t, "First Table");
		Section s = new Section();
		s.getTables().add(t);
		System.out.println(JSONFormatter.compact(s));
		System.out.println(JSONFormatter.pretty(s));
		
	}

	private static void makeTable(Table t, String title) {
		
		for(int i=1; i<= 10; i++){
			t.getHeader().getData().add("Header "+ 0);
		}
		for(int i=0; i< 10; i++){
			Row r = new Row();
			makeRow(r);
			t.getRows().add(r);
		}
	}

	private static void makeRow(Row r) {
		for(int j=0; j< 20; j++){
			r.getData().add( ""+Math.random() * 10); 
		}
	}

}
