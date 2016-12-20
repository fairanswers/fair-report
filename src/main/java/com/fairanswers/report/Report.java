package com.fairanswers.report;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
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

	public String toHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<H1>");
		sb.append(header);
		sb.append("</H1>");
		sb.append(END);
		
		sb.append(details);
		sb.append(END);
		
		for(Section s:getSections() ){
			sb.append(s.toHtml() );
		}
		for(Table t:getTables() ){
			sb.append(t.toHtml() );
		}
		
		return sb.toString();
	}

	//Using old method for old java versions.
	public static boolean save(String name, String data) {
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(name), "utf-8"));
		    writer.write(data);
		    return true;
		} catch (IOException ex) {
			System.out.println("Error saving file "+name);
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		  return false;
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}

}
