package com.exception;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			System.out.println(uploadFile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String uploadFile() throws Exception {

		try {
			File file = new File("error444.txt");
			FileInputStream fin = new FileInputStream(file);
			return "try....................";
		} catch (Exception e) {
			System.out.println("Error occured due to :" + e.getMessage());
			return "catch....................";
		} finally {
			return "finally successfully";
		}
	}
}
