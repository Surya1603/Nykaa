package org.nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("SurYa2023");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("1603Surya@");
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		WebElement loc = driver.findElement(By.name("location"));
		loc.click();
		Select s = new Select(loc);
		s.selectByValue("London");
		Thread.sleep(3000);
		WebElement htl = driver.findElement(By.id("hotels"));
		htl.click();
		Select s1 = new Select(htl);
		s1.selectByIndex(1);
		WebElement typ = driver.findElement(By.id("room_type"));
		typ.click();
		Select s2 = new Select(typ);
		s2.selectByIndex(1);
		WebElement rm = driver.findElement(By.id("room_nos"));
		rm.click();
		Thread.sleep(3000);
		Select s3 = new Select(rm);
		s3.selectByValue("2");
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.sendKeys("16/03/2023");
		WebElement outdate = driver.findElement(By.name("datepick_out"));
		outdate.sendKeys("18/03/2023");
		WebElement room = driver.findElement(By.id("adult_room"));
		room.click();
		Select s4 = new Select(room);
		s4.selectByVisibleText("2 - Two");
		WebElement child = driver.findElement(By.id("child_room"));
		child.click();
		Select s5 = new Select(child);
		s5.selectByIndex(2);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement ht = driver.findElement(By.id("radiobutton_0"));
		ht.click();
		WebElement con = driver.findElement(By.name("continue"));
		con.click();
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys("Surya");
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys("Prakash");
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("4/5,2nd cross street,Chennai");
		WebElement credit = driver.findElement(By.id("cc_num"));
		credit.sendKeys("1234567895412360");
		WebElement cvv = driver.findElement(By.id("cc_type"));
		cvv.click();
		Select s6= new Select(cvv);
		s6.selectByValue("VISA");
		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
		expdate.click();
		Select s7 = new Select(expdate);
		s7.selectByVisibleText("March");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		expyear.click();
		Select s8 = new Select(expyear);
		s8.selectByIndex(8);
		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys("003");
		WebElement clk = driver.findElement(By.name("book_now"));
		clk.click();
		WebElement fin = driver.findElement(By.name("search_hotel"));
		fin.click();
		
		
	}

	}


