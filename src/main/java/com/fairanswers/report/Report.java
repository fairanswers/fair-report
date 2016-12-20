package com.fairanswers.report;

import java.util.ArrayList;

public class Report {
	String header = "Report Header";
	String details = "";
	ArrayList<Section> sections = new ArrayList<Section>();
	ArrayList<Table> tables = new ArrayList<Table>();
	public static String END = "\n";
	
	public Report(){
		
	}
	
	public String toText() {
		StringBuffer sb = new StringBuffer();
		sb.append(header+END );
		sb.append(details+END );
		for(Section s:getSections() ){
			sb.append(s.toText() );
		}
		for(Table t:getTables() ){
			sb.append(t.toText() );
		}
		return sb.toString();
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	public ArrayList<Table> getTables() {
		return tables;
	}

	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}

	public String getEnd() {
		return END;
	}

	public void setEnd(String end) {
		this.END = end;
	}

}
