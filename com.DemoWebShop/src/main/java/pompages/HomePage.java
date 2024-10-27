package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(className = "ico-register")
	private WebElement registerLink;
	
	@FindBy(className = "ico-login")
	private WebElement loginLink;
	
	@FindAll({@FindBy(xpath = "//li[@id='topcartlink']"),@FindBy(id = "topcartlink"),@FindBy(xpath = "//span[text()='Shopping cart']")})
	private WebElement cartLink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishListLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}
	
	
	
	
	
	
	

}
