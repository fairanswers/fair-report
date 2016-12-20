package com.fairanswers.report;

public class HtmlFormatter {

	public String pretty(Report r) {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><body>");
		sb.append(r.getEnd());
		sb.append(r.toHtml() );
		sb.append(r.getEnd());
		sb.append("</body></html>");
		return sb.toString();
	}

}
