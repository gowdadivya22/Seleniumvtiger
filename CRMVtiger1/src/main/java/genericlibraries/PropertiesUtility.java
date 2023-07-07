package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility implements IConstantInterface {
	/**
	 * 047314
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readingdataFromPropertyFile(String key)  {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(PROPERTFILE);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties ppt=new Properties();
		try {
			ppt.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return ppt.getProperty(key);
	
	}

}
