package com.fairanswers.report.examples;

import com.fairanswers.report.HtmlFormatter;
import com.fairanswers.report.JSONFormatter;
import com.fairanswers.report.Report;
import com.fairanswers.report.Row;
import com.fairanswers.report.Section;
import com.fairanswers.report.Table;
import com.fairanswers.report.TextFormatter;

public class SimpleExample {
	public static void main(String [] args){
		Report r = new Report();
		r.setHeader("Example Report Header");
		r.setDetails("Example Report Details");
		Table t = new Table();
		makeTable(t, "First Table");
		Section s = new Section();
		s.getTables().add(t);
		r.getSections().add(s);
		System.out.println(new JSONFormatter().compact(r) );
		System.out.println(new JSONFormatter().pretty(r) );
		System.out.println(new TextFormatter().pretty(r) );
		System.out.println(new HtmlFormatter().pretty(r) );
		Report.save("test.html", new HtmlFormatter().pretty(r) );
	}

	private static void makeTable(Table t, String title) {
		
		for(int i=1; i<= 10; i++){
			t.getHeaderRow().getData().add("Header "+ i);
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
