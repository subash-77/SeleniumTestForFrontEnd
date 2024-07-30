package com.subash.SeleniumExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DeleteJewelry_Test {

	private WebDriver driver;

	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();

	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	void deleteJewelry() throws InterruptedException {
		driver.get("http://localhost:3000/viewjewelry");
		driver.manage().window().maximize();
	    driver.findElement(By.linkText("VIEW JEWELRY")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".text-center:nth-child(1) .ms-1")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		String alertMessage = driver.switchTo().alert().getText();

		assertEquals("Do you want to delete?", alertMessage);
		Thread.sleep(5000);

		alert.accept();

	
		

	}

}
