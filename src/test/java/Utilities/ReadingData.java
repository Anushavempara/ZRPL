package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadingData {
	
	Properties pro;
	public ReadingData() {
		
		File f=new File("C:\\Users\\vempa\\eclipse-workspace-TeamMember\\ZRPL_TestCases\\Configuration\\config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getEmail() {
		String email=pro.getProperty("Email");
		return email;
	}

}
