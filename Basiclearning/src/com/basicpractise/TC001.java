package com.basicpractise;

public class TC001 extends BaseTest

{

	public static void main(String[] args) throws Exception

	{

		init();

		Launch("chromebrowser");

		navigateurl("hdfcurl");

		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		

	}

}
