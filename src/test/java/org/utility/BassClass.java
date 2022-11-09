package org.utility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {

	public static WebDriver driver; 
	
	public static WebDriver browerLaunch(String browsername) {
	
	if(browsername.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    
	}
	
	else if(browsername.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	
	}
	
	
	else if(browsername.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	
	return driver;
	
	}
	
	//url launch
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	
	// maximize
	
	public static void maximiza() {
		driver.manage().window().maximize();
	}
	
	//time
	
	public static void impliciwait(long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		
	}
	
	//sendkeys
	
	public static void sendkeys(WebElement n,String value) {
		n.sendKeys(value);
	}
	
	//click
	public static void quit() {
		driver.quit();
	}

	//current url
	
	public static String currentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//title 
	
	public static String title() {
		String title = driver.getTitle();
		return title;
	}
	
	
	//getattribute
	
	public static String getAttribute(WebElement n) {
		String att = n.getAttribute("value");
		return att;
	}
	
	//move to element
	public static void moveToElement(WebElement target) {
		Actions n=new Actions(driver);
		n.moveToElement(target).perform();
	}
	
	//drag and drop
	public static void dragAndDrop(WebElement src ,WebElement des) {
		Actions n=new Actions(driver);
		n.dragAndDrop(src, des).perform();
	}
	
	// select by index
	
	public static void selectByIndex(WebElement n, int index) {
		Select s=new Select(n);
		s.selectByIndex(index);
	
	}
	
	
	//click
	public static void click(WebElement n) {
		n.click();
	}
	
	//quit
	public static void quit1() {
		driver.quit();
	}
	
	//isSelect
	
public static boolean isSelect(WebElement n) {
	boolean select = n.isSelected();
	return select;
	
}
	
//contextclick

public static void contextClick(WebElement target) {
	Actions n = new Actions(driver);
	n.contextClick(target).perform();
}


//move to element


public static void moveToElement1(WebElement target) {
	Actions n = new Actions(driver);
	n.moveToElement(target).perform();
}

//duobleclick

public static void doubleClick(WebElement target) {
	Actions n = new Actions(driver);
	n.doubleClick(target).perform();
}

//navigate back

public static void back() {
	driver.navigate().back();
}

//navigate refresh

public static void refresh() {
	driver.navigate().refresh();
}

public static void forward() {
	driver.navigate().forward();
}

//isMultiple

public static boolean isMultiple(WebElement s, String value) {
	Select n=new Select(s);
	boolean multiple = n.isMultiple();
	return multiple;
}

//select by value

public static void selectByValue(WebElement s, String value) {
	Select n = new Select(s);
	n.selectByValue(value);
}

//select by visible text

public static void selectVisibleText(WebElement s, String value) {
	Select n = new Select(s);
	n.selectByVisibleText(value);
}

//equal

public static boolean equal() {
	boolean equals = driver.equals(driver);
			
	return equals;
	
	
}

//isdisplayed

public static boolean isDisplayed(WebElement j) {
	boolean displayed = j.isDisplayed();
	return displayed;
	
}









}
