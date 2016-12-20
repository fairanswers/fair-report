package com.fairanswers.report;

import java.util.ArrayList;

public class Table {
	ArrayList<Row> rows = new ArrayList<Row>();
	Row headerRow = new Row();

	public String toText() {
		StringBuffer sb = new StringBuffer();
		sb.append(headerRow.toText() );
		for(Row row:getRows() ){
			sb.append(row.toText() );
		}
		return sb.toString();
	} 
	
	public ArrayList<Row> getRows() {
		return rows;
	}

	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	public Row getHeaderRow() {
		return headerRow;
	}

	public void setHeader(Row headerRow) {
		this.headerRow = headerRow;
	}
	
}
