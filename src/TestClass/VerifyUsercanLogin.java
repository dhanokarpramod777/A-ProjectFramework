package TestClass;

public class VerifyUsercanLogin extends UtilClass1 {
//	WebDriver driver ;
//	LoginPage lp;
//	
//	ExtentHtmlReporter htmlReporter;
//	ExtentReports report;
//	ExtentTest test;
	
//	  @BeforeClass  
//	  public void beforeClass() throws InterruptedException 
//	  { 
//		  driver = BaseClass1.getChromeDriver();
//		  
//		  htmlReporter = BaseClass1.gethtmlReporter();
//		  report = BaseClass1.getExtentReports();
//		  test = BaseClass1.getTestForReproter("VerifyUsercanLogin");
//			
//	  }
//	  
//	  @BeforeMethod
//	  public void beforeMethod() throws IOException, InterruptedException {
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		  lp = new LoginPage(driver);
//		 
//	  }
//	  
//	  @Test(priority=1)
//	  public void LoginUser() throws IOException, InterruptedException {
//		    lp.is_Enetr_Email();
//		    lp.is_Enter_PassWord();
//		    lp.is_Click_SubmitButton5();
//		    Thread.sleep(2000);
//	  }
//	  @AfterMethod
//	  public void afterMethod(ITestResult result) throws IOException {
//
//		  if(result.getStatus() == ITestResult.SUCCESS){
//				test.log(Status.PASS, "Test is passed " + result.getName());
//			}
//			else
//			{
//				String path = hp.getScreenShot(driver, result.getName());
//				test.log(Status.FAIL, "Test is failed " + result.getName(), 
//				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
//			}  			  
//	  } 
//  @AfterClass
//  public void afterClass() {
//	  report.flush();
//	  driver.quit();  
//  }
}
