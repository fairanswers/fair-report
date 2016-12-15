package com.fairanswers.report;

import java.util.ArrayList;

public class Report {
	String header = "Report Header";
	String details = "";
	
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

	ArrayList<Section> sections = new ArrayList<Section>();
	
	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

}
