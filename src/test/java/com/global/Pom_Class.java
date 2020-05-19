package com.global;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Pom_Class extends Base_Class{
	public Pom_Class()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="srch-term")
	private WebElement searchbox;
	public WebElement getSearchbox() {
		return searchbox;
	}
	@FindBy(xpath="//a[@class='swatch_248239 product-imglink']")
	private WebElement downarrow;
	public WebElement getDownarrow() {
		return downarrow;
	}
	@FindBy(xpath ="//img[@src='https://media.ezibuy.com/productimages/248092/No_Colour/Versace_Dylan_Blue_Pour_Homme_EDT_Lister_1_10174455808030.jpg']")
	private WebElement selectitem;
	public WebElement getSelectitem() {
		return selectitem;
		
		
	}
	}
