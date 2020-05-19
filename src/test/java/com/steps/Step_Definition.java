package com.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.global.Base_Class;
import com.global.Pom_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class{


@Given("the correct web address")
public void the_correct_web_address() {
    launch();
}

@When("I navigate to the {string} page")
public void i_navigate_to_the_page(String string) {
    loadurl("https://www.ezibuy.com/shop/nz/");
}

@Then("I can browse a list of the available products.")
public void i_can_browse_a_list_of_the_available_products() throws AWTException, InterruptedException {

	Pom_Class p=new Pom_Class();
   type(p.getSearchbox(), "versace");
   Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
}

@When("I navigate down")
public void i_navigate_down() throws InterruptedException {
	Thread.sleep(1000);
	Pom_Class p=new Pom_Class();
	   scroll(p.getDownarrow());
}

@Then("I select Item")
public void i_select_Item() throws InterruptedException {
	Thread.sleep(1000);
	Pom_Class p=new Pom_Class();
	clicked(p.getSelectitem());
}

@When("I select quantity")
public void i_select_quantity() throws InterruptedException, AWTException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='caret'])[2]")).click();
	
	down(2);
	driver.findElement(By.xpath("(//div[@class='caret'])[2]")).click();
}

@When("I select size")
public void i_select_size() throws InterruptedException {
	driver.findElement(By.xpath("(//div[@class='caret'])[3]")).click();
	
	driver.findElement(By.xpath("//a[text()='50ml']")).click();
	Thread.sleep(1000);
}

@Then("Add to bag")
public void add_to_bag() {
clicked(driver.findElement(By.xpath("//a[@class='ezbtn btn-addtobag js-add-to-bag js-product-added']"))); 
}





}



