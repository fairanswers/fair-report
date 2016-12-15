package com.fairanswers.report;

import java.util.ArrayList;

public class Section {
	String header = "Default Header";
	String details = "";
	ArrayList<Table> tables = new ArrayList<Table>();
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<Table> getTables() {
		return tables;
	}
	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}
}
