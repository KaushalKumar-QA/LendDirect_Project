package com.qa.selenium.core.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		WebDriver driver;

		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Unthinkable-lap\\Downloads\\bridge-loan-automation\\bridge-loan-automation\\Chromedriver\\chromedriver.exe");
		driver.get("https://semantic-ui.com/modules/dropdown.html");
	}

}
