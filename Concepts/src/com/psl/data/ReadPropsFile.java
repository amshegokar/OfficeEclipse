package com.psl.data;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropsFile {

	public static void main(String[] args) {
		
		Properties props = new Properties();
        try {
			props.load(new FileInputStream(new File("./resources/DMaapMR.properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(props);
	}
	
 

}
