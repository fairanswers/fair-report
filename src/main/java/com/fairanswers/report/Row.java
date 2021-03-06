package com.fairanswers.report;

import java.util.ArrayList;
import java.util.Formatter;

public class Row {
	ArrayList<String> data = new ArrayList<String>();

	public ArrayList<String> getData() {
		return data;
	}

	public void setData(ArrayList<String> data) {
		this.data = data;
	}

	public String toText() {
		StringBuffer sb = new StringBuffer();
		Formatter fm = new Formatter(sb);
		for(String str:data){
			fm.format("%s\t", str) ;
		}
		sb.append(Report.END);
		return sb.toString();
	}

	public String toHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<tr>");
		Formatter fm = new Formatter(sb);
		for(String str:data){
			fm.format("<td>%s</td>\t", str) ;
		}
		sb.append("</tr>");
		sb.append(Report.END);
		return sb.toString();
	}

	public String toHeaderHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<tr>");
		Formatter fm = new Formatter(sb);
		for(String str:data){
			fm.format("<th>%s</th>\t", str) ;
		}
		sb.append("</tr>");
		sb.append(Report.END);
		return sb.toString();
	}
}
