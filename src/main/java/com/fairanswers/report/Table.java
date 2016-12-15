package com.fairanswers.report;

import java.util.ArrayList;

public class Table {
	ArrayList<Row> rows = new ArrayList<Row>();
	Row header = new Row();

	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	public Row getHeader() {
		return header;
	}

	public void setHeader(Row header) {
		this.header = header;
	} 
	
	
}
