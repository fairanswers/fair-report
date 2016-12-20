package com.fairanswers.report;

public class TextFormatter {

	private String header = "#######################";
	private String footer = "-----------------------";
	public String pretty(Report r) {
		StringBuffer sb = new StringBuffer();
		sb.append(header);
		sb.append(r.getEnd());
		sb.append(r.toText() );
		sb.append(r.getEnd());
		sb.append(footer);
		sb.append(r.getEnd());
		return sb.toString();
	}

}
