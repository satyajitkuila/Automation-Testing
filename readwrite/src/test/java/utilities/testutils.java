package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Common.BaseTest;

public class testutils extends BaseTest{
	ExtentTest test = extent.createTest("verify extent report").assignAuthor("Satyajitkuila");
	public void getScreenshot() throws IOException 
	{
		Date currentdate = new Date();
		String scrnshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("./screenshot//" + scrnshotfilename + ".png"));
	}
	public void pass() {
		
		test.pass("Testcase is passed");
	}
	public void fail() {
		test.fail("Test case Failed");
	}
	public void scrnsht() {
		Date currentdate = new Date();
		String scrnshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(".//screenshot//" + scrnshotfilename + ".png").build());
	}

}
