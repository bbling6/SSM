package org.lq.ssm.system.utils;

import java.io.File;

public class TestFile  {
	
	public static void main(String[] args) {
		
		File file = new File("F:\\Tomcat 7.0\\webapps\\Test-ssm\\WEB-INF\\upload\\14\\8\\7557faef-7bbd-4f15-8e41-e8159c170ca8.mp3");
		
		System.out.println(FileTypeTest.getFileByFile(file));
	
	}
	

}
