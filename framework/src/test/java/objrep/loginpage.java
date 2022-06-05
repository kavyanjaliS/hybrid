package objrep;

import org.openqa.selenium.By;

public class loginpage {

	public static By login=By.xpath("(//div[@class='nb__19hcF'])[1]");
	public static By phnumber=By.id("//input[@class='form-control'][1]");
	//public static By generateotp=By.xpath("(//label[@class='nb-radio radio-inline'])[1]");
	//public static By otp=By.xpath("(//input[@maxlength='1'])[1]");
	//public static By otp2=By.xpath("(//input[@maxlength='1'])[2]");
	//public static By otp3=By.xpath("(//input[@maxlength='1'])[3]");
	//public static By otp4=By.xpath("(//input[@maxlength='1'])[4]");
	//public static By btncontinue=By.id("signUpSubmit");
	public static By havepword = By.name("loginType");
	public static By password = By.xpath("//input[@id='login-signup-form__password-input']");
	public static By btncontinue=By.id("signUpSubmit");

}
