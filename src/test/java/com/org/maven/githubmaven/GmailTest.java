package com.org.maven.githubmaven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GmailTest {
WebDriver driver;
@Before
public void setup()
{
driver = new FirefoxDriver();
driver.get("http://www.gmail.com");
System.out.println("test");
}

@Test
public void Test()
{
driver.findElement(By.id("Email")).sendKeys("Test@test.com");
}

@After
public void TearDown()
{
driver.quit();
}
}
