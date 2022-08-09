package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
	public static void JvmReportGenerate(String json) {
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\My-WorkRepo\\RCBTest\\target\\Report\\JSONReport");
		
		Configuration c = new Configuration(f, "RCBReport");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Platform", "Windows");
		
		List<String> l = new LinkedList<String>();
		l.add(json);
		
		ReportBuilder r = new  ReportBuilder(l, c);
		r.generateReports();
		
	}
}
