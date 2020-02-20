package com.basicpractise;

public class TC002 extends BaseTest

{

	public static void main(String[] args) throws Exception

	{
		
		init();
		
		Launch("firefoxbrowser");
		Thread.sleep(5000);
		
		navigateurl("bestbuyurl");

	}

}
