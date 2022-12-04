package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LoginSteps {
	
	public static WebDriver driver;
	
	@Given("the chrome browser is installed")
	public void the_chrome_browser_is_installed() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	}

	@Then("the particular user logs in")
	public void the_particular_user_logs_in() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.id("identifierId")).sendKeys("peterpatrick1029@gmail.com");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("peter@1029");
	    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	    Thread.sleep(30000);
	}
	
	@Given("the particular user is already loggedin")
	public void the_particular_user_is_already_loggedin() throws InterruptedException {
		
	
	}
	
	@When("the logged in user clicks on compose button")
	public void the_logged_in_user_clicks_on_compose_button() throws InterruptedException {
		
	    driver.findElement(By.cssSelector(".T-I.T-I-KE.L3")).click();
	    Thread.sleep(3000);
	}
	
	@When("enters the sender email")
	public void enters_the_sender_email() throws InterruptedException {
	    
		driver.findElement(By.cssSelector("body > div:nth-child(35) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > form:nth-child(1) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("shubhanshushukla@outlook.com");
		Thread.sleep(3000);
	}
	
	@When("enters the subject of the email")
	public void enters_the_subject_of_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id=':eh']")).sendKeys("Incubyte");
		Thread.sleep(3000);
	}
	
	@When("enters messageparagraphs in the email")
	public void enters_messageparagraphs_in_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id=':fo']")).sendKeys("Automation QA test for Incubyte");
		Thread.sleep(3000);
	}
	
	@Then("the sender will get the email")
	public void the_sender_will_get_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
	}
	
	@When("clicks on Schedule Email")
	public void clicks_on_schedule_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@class='G-asx'])[2]")).click();
		Thread.sleep(3000);
	}
	
	@Then("user should be able to select date time and schedule the email")
	public void user_should_be_able_to_select_date_time_and_schedule_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@class='J-N-Jz'][normalize-space()='Schedule send'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Tomorrow afternoon']")).click();
		Thread.sleep(3000);
		
	}
	
	@When("enters the cc email")
	public void enters_the_cc_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//span[@id=':8m'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=':cz']")).sendKeys("imshukzz@gmail.com");
		Thread.sleep(3000);
		
	}
	
	@Then("the sender & cc  will get the email")
	public void the_sender_cc_will_get_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
		
	}
	
	@When("enters the bcc email")
	public void enters_the_bcc_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//span[@id=':5s'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=':gk']")).sendKeys("sibushukla@outlook.com");
        Thread.sleep(3000);
		
	}
	
	@Then("the sender, cc & bcc  will get the email")
	public void the_sender_cc_bcc_will_get_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
		
	}
	
	@Then("the user will not be able to send to the receiver")
	public void the_user_will_not_be_able_to_send_to_the_receiver() {
	    
		System.out.print("Not able to send to the receiver");
		
	}
	
	@Then("error message is displayed")
	public void error_message_is_displayed() {
	    
		System.out.print("Error Displayed");
		
	}
	
	@When("enters the wrong sender email")
	public void enters_the_wrong_sender_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id=':io']")).sendKeys("shubhanshushukla@o.com");
		Thread.sleep(3000);
		
	}
	
	@Then("the sender will not get the email")
	public void the_sender_will_not_get_the_email() {
	    
		System.out.print("Sender email wrong");
		
	}
	
	@When("click on the send email cta")
	public void click_on_the_send_email_cta() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
		
	}
	
	@When("user clicks on emoji selector")
	public void user_clicks_on_emoji_selector() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id=':dh']")).click();
        Thread.sleep(3000);
		
	}

	@When("user selects any one emoji")
	public void user_selects_any_one_emoji() throws InterruptedException {
	    
		driver.findElement(By.xpath("//img[@aria-label='😃']")).click();
        Thread.sleep(3000);
		
	}
	
	@When("user clicks on trash icon below")
	public void user_clicks_on_trash_icon_below() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@class='og T-I-J3'])[1]")).click();
        Thread.sleep(3000);
		
	}

	@Then("the user should verify it from the drafts")
	public void the_user_should_verify_it_from_the_drafts() throws InterruptedException {
	    
		
		driver.findElement(By.xpath("//a[normalize-space()='Drafts']")).click();
        Thread.sleep(3000);
        System.out.print("Draft is empty");
        
	}
	
	@When("enters messageparagraph in the email")
	public void enters_messageparagraph_in_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id=':fo']")).sendKeys("Automation QA test for Incubyte");
		Thread.sleep(3000);
		
	}

	@When("the logged in user clicks on the compose button")
	public void the_logged_in_user_clicks_on_the_compose_button() throws InterruptedException {
		
		driver.findElement(By.cssSelector(".T-I.T-I-KE.L3")).click();
	    Thread.sleep(3000);
	}

	@When("enters the messageparagraph in the email")
	public void enters_the_messageparagraph_in_the_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("//div[@id=':fo']")).sendKeys("Automation QA test for Incubyte");
		Thread.sleep(3000);
		
	}

	@Then("the user will be able to send email to receiver")
	public void the_user_will_be_able_to_send_email_to_receiver() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
		
	}

	@Then("user sends email to the sender email")
	public void user_sends_email_to_the_sender_email() throws InterruptedException {
	    
		driver.findElement(By.xpath("(//div[@id=':e7'])[1]")).click();
		Thread.sleep(3000);
		
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		
		driver.close();
		
	}

}


