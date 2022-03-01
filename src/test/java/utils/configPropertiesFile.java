package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configPropertiesFile {
	
	
	public static Properties readPropertiesFile() throws IOException {
		
		Properties prop=new Properties();
		
	
		FileInputStream input=new FileInputStream("C:\\Users\\sofij\\eclipse-workspace\\DS_Algo_Project_POM_Framework\\src\\test\\java\\utils\\config.properties");
		
		prop.load(input);
		
		return prop;
	}	
		

		
		public  static String  getUrl() throws IOException
		{
		return 	 readPropertiesFile().getProperty("URL");
		}
			
	public static String getUserName() throws IOException
	{
	return	readPropertiesFile().getProperty("Username");
		
	}
	public  static String getPassword() throws IOException
	{
	return	readPropertiesFile().getProperty("Password");
		
	}
public static String  getEditorText() throws IOException
{
	return readPropertiesFile().getProperty("EditorText");
}

public static String  getEditorText2() throws IOException
{
	return readPropertiesFile().getProperty("EditorText2");
}
public static String invalidcode() throws IOException 
{
	return readPropertiesFile().getProperty("invalidcode");
}
}
