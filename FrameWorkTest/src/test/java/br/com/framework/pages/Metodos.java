package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	WebDriver driver;

	public void navegador(String url, String navegador) {

		switch (navegador) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			break;

		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		}

	}

}
