package reporting;


import com.relevantcodes.extentreports.ExtentReports;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;
    private static ITestContext context;

    public synchronized static ExtentReports getInstance(){
        if(extent == null){
            File outputDirectory = new File(context.getOutputDirectory());
            File resultDirectory = new File(outputDirectory.getParentFile(),"html");
            System.out.println("outputDirectory: " + outputDirectory +"\nresultdir: " + resultDirectory);
            extent = new ExtentReports("/Users/kawsar/Desktop/Projects/WebAutomation/automation_practice/test-output/report.html", true);
            Reporter.log("Extent Report Directory: "+ resultDirectory, true);
            extent.addSystemInfo("Host Name", "Tester").addSystemInfo("Environment","QA")
                    .addSystemInfo("User Name", "Team_Three");
            extent.loadConfig(new File("/Users/kawsar/Desktop/Projects/WebAutomation/automation_practice/test-output/report-config.xml"));
        }
        return extent;
    }

    public static void setOutputDirectory(ITestContext context){
        ExtentManager.context = context;

    }
}
