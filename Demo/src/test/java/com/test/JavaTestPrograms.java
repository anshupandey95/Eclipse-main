package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JavaTestPrograms {
	 String rev = "";
	
	
	@Test
	public void reverseString() {
		
   String stree = "Hello World!";
   
  
   for(int i = stree.length()-1;i>=0;i--) {
	   rev += stree.charAt(i);
	   
   }
   System.out.println(rev);
        
       
    }
	@Test
	public void removeDuplicateString() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement fashiontab =driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[3]"));
		fashiontab.click();
		Thread.sleep(4000);
		
		 List<WebElement> Listsoftabs = driver.findElements(By.xpath("//div[@class='_31z7R_']//a[@class='_3490ry']"));
		for(WebElement e : Listsoftabs) {
			String a = e.getText();
			if (a.equals("Men's Formal Shirts")) {
                // Click on the desired item
                e.click();
                break;
		}
			
			
	}

		Thread.sleep(3000);
		
		 WebElement pricmin = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		 pricmin.click();
		 Thread.sleep(2000);
		 Select se = new Select(pricmin);
		 se.selectByValue("500");
		 
		 
		 Thread.sleep(4000);
		 List<WebElement> priListing =driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
	
		 for(WebElement lis: priListing) {
			 String pricetexts = lis.getText().replaceAll("[^0-9]", "");
			 System.out.println(pricetexts);
			 
			 int price = Integer.parseInt(pricetexts);

	            if (price >= 500) {
	                System.out.println("Price is greater than 500: " + pricetexts);
	            } else {
	                System.out.println("Price is less than 500: " + pricetexts);
	            }
	            
		 }
		 Thread.sleep(2000);
		
		 
	    }
	 
		
	}

		
	


