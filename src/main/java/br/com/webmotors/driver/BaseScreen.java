package br.com.webmotors.driver;

import static br.com.webmotors.driver.Driver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen {

	public BaseScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	public void esperarPorElementoVisivel() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hands.android.webmotors:id/btSkipLogin")))
		;
	}
}
