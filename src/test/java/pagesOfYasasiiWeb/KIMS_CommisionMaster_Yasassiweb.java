
package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_CommisionMaster_Yasassiweb extends PageFactoryInitYasasiiWeb {

	public KIMS_CommisionMaster_Yasassiweb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement menuToggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastersModule;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='RCM-Finance']")
	public WebElement rcmFinanace;
	
	@FindBy(xpath = "//div[normalize-space()='Commission Rule Master']")
	public WebElement commisionRuleMaster;
	
	@FindBy(xpath = "//input[@id='rulename']")
	public WebElement ruleNameField;
	
	@FindBy(xpath = "//button[@class='dropdown-toggle form-control multiselect-list']")
	public WebElement visitmodedropdown;
	
	@FindBy(xpath = "//main[@class='page-body']//a[3]]")
	public WebElement op;
	
	@FindBy(xpath = "//main[@class='page-body']//a[5]")
	public WebElement ip;
	
	@FindBy(xpath = "//input[@id='rootinvcategory']")
	public WebElement baseCategory;
	
	@FindBy(xpath = "//input[@id='commissionvalue']")
	public WebElement commissionvalue;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//input[@id='servicename']")
	public WebElement serviceName;
	
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//input[@placeholder='Rule Name']")
	public WebElement search;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement edit;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement toggle;
	
	@FindBy(xpath = "//div[normalize-space()='Commission Rule Mapping']")
	public WebElement commissionRuleMapping;
	
	@FindBy(xpath = "//div[@class='col-md-12 plt-prt-5']//input[@id='RuleDetails']")
	public WebElement ruleName;
	
	@FindBy(xpath = "//div[@class='col-6 col-md-2 col-lg-2 pt-3']//input[@id='RuleDetails']")
	public WebElement ruleNameDropdown;
	
	@FindBy(xpath = "//div[3]//ki-auto-complete-pagination[1]//div[1]//input[1]")
	public WebElement department;
	
	@FindBy(xpath = "//div[4]//ki-auto-complete-pagination[1]//div[1]//input[1]")
	public WebElement providerName;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement successfullyOk;
	
	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement searchProvider;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement validation;
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement toggle1;
	
	@FindBy(xpath = "//div[normalize-space()='Commission Calculation']")
	public WebElement commissionCalculation;
	
	@FindBy(xpath = "(//button[@class=\"dropdown-toggle form-control multiselect-list\"])[1]")
	public WebElement department1;
	
	@FindBy(xpath = "(//button[@class=\"dropdown-toggle form-control multiselect-list\"])[2]")
	public WebElement provider;
	
	@FindBy(xpath = "//input[@id='month']")
	public WebElement month;
	
	@FindBy(xpath = "//input[@id='year']")
	public WebElement year;
	
	@FindBy(xpath = "//button[@title='To calculate and display']")
	public WebElement calculate;
	
	@FindBy(xpath = "//i[@class='ki ki-chevron-right']")
	public WebElement expand;
	
	@FindBy(xpath = "//button[@class='pagination-buttons next sm active']")
	public WebElement next;
	
	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement print;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement detailedReport;
	
	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;
	
	@FindBy(xpath = "//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement confirm;
	
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;
	// @FindBy(xpath = "") public WebElement ;

	public void CreateRule(String RuleName, String Department) throws InterruptedException, AWTException {
   ///////////commisionRuleMaster
		
		Thread.sleep(2000);
		menuToggle.click();
		Thread.sleep(1000);
		mastersModule.click();
		Thread.sleep(1000);
		rcmFinanace.click();
		Thread.sleep(1000);
		commisionRuleMaster.click();
		Thread.sleep(1000);
		ruleNameField.sendKeys(RuleName);
		Thread.sleep(1000);
		visitmodedropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[3]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[5]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(1000);
		baseCategory.sendKeys("Consultation");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consultation']")).click();
		Thread.sleep(1000);
		commissionvalue.sendKeys("2");
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		visitmodedropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[5]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(1000);
		baseCategory.sendKeys("OR Parameter");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OR Parameter']")).click();
		Thread.sleep(1000);
		serviceName.sendKeys("Surgeon Fee");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Surgeon Fee']")).click();
		Thread.sleep(1000);
		commissionvalue.sendKeys("2");
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		visitmodedropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[3]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[5]//span[1]//span[1]//span[1]//i[1]")).click();
		Thread.sleep(1000);
		baseCategory.sendKeys("Procedure");
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000);
		commissionvalue.sendKeys("2");
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		
		try{
			saveButton.click();
			Thread.sleep(2000);
			
		}
		catch(Exception e){
			driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
			Thread.sleep(1000);	
		
		}
		
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(RuleName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='" + RuleName + "']	")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		saveButton.click();// update
		Thread.sleep(1000);
		toggle.click();
		Thread.sleep(1000);
	/////////////commissionRuleMapping
		
		Thread.sleep(2000);
		commissionRuleMapping.click();
		Thread.sleep(1000);
		ruleName.sendKeys(RuleName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + RuleName + "']")).click();
		Thread.sleep(1000);
		ruleNameDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + RuleName + "']")).click();
		Thread.sleep(1000);
		department.sendKeys(Department);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + Department + "']")).click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		saveButton.click();
		Thread.sleep(1000);
		successfullyOk.click();
		Thread.sleep(1000);
		searchProvider.sendKeys(Provider, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		ruleNameDropdown.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Priyanga Rule']")).click(); //// ask which wrong rule
		Thread.sleep(1000);
		providerName.clear();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Provider+"')])[2]")).click();	
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		validation.click();
		Thread.sleep(1000);
		saveButton.click();// update
		Thread.sleep(1000);
		toggle1.click();
		Thread.sleep(1000);
		//////////////commissionCalculation
		
		commissionCalculation.click();
		Thread.sleep(1000);
		department1.click();
		Thread.sleep(1000);
		department1.sendKeys(Department);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='" + Department + "']")).click();
		Thread.sleep(1000);
		provider.click();
		Thread.sleep(1000);
		provider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		
        LocalDate today = LocalDate.now();

        String Month = today.getMonth()
                            .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        
        int Year = today.getYear();
        
        System.out.println("today: " + today);
        System.out.println("Month: " + Month);
        System.out.println("Year: " + Year);
		
		
		
		month.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Month+"']")).click();
		Thread.sleep(1000);
		year.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Year+"']")).click();
		Thread.sleep(1000);
		calculate.click();
		Thread.sleep(1000);
		expand.click();
		Thread.sleep(1000);
		int i = 0;
		//if (next.isEnabled()) {
		while (i <= 3) {
			next.click();
			Thread.sleep(1500);
			i++;
		}
		
		print.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		detailedReport.click();
		Thread.sleep(2000);
		print.click();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

	}

	public void reverseDeleteRule(String RuleName) throws InterruptedException {
////////////delete mapping
		
		toggle1.click();
		Thread.sleep(1000);
		commissionRuleMapping.click();
		Thread.sleep(1000);
		ruleName.sendKeys(RuleName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='" + RuleName + "']")).click();
		Thread.sleep(1000);
		searchProvider.sendKeys(Provider, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
		saveButton.click();// update
		Thread.sleep(1000);
		toggle1.click();
		Thread.sleep(1000);
		
////////////delete master rule
		
		commisionRuleMaster.click();
		Thread.sleep(1000);
		search.sendKeys(RuleName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='" + RuleName + "']	")).click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(1000);
		confirm.click();
		driver.findElement(By.xpath("//a//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		saveButton.click();// update
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(RuleName, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='" + RuleName + "']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		confirm.click();
		Thread.sleep(1000);
	}

}

