package resources;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsFile
{
	
	public static ExtentReports ExtentReportData()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Test results");
		
		ExtentReports n=new ExtentReports();
		n.attachReporter(reporter);
		n.setSystemInfo("tester", "Mubeena");
		return n;

	}

}
