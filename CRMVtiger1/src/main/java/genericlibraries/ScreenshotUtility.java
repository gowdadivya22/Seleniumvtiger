package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtility extends BaseClass implements IConstantInterface{
	public static String takingScreenshot(String screenshotName) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File photo=ss.getScreenshotAs(OutputType.FILE);
		String ldt=LocalDateTime.now().toString().replace(":", "-");
		String path=System.getProperty("user.dir")+SSPATH+screenshotName+" "+ldt+".png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(photo, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
		
		
	}
}
