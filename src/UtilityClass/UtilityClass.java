package UtilityClass;

public class UtilityClass {

//	
//	// ScreenShort
//	public static String getScreenShot(WebDriver driver , String testName) throws IOException
//	{
//		Date date = new Date();
//		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
//		String currentDate = f.format(date);
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String path = testName + ".png" ;
//		File dest = new File(path);
//		FileHandler.copy(source, dest);
//		return path;
//	}
//	
//	public static WebElement expliciteWait(WebDriver driver, WebElement element)
//	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
//		
//		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
//		
//		return element1;
//	}
//	
//	public static WebElement expliciteWaitAlert(WebDriver driver, Alert element)
//	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
//		
//		WebElement element2 = wait.until(ExpectedConditions.visibilityOf((WebElement) element));
//		
//		return element2;
//	}
//	
//	
//	public static String getDataFromPropertyFile(String key) throws IOException
//	{
//		
//		FileInputStream file = new FileInputStream("configuration\\config.properties");
//		
//		Properties prop = new Properties();
//		prop.load(file);
//		
//		return prop.getProperty(key);
//	}
//	
//	
//	   
//	public static Call getDataFromExcelFile(int r , int c) throws IOException
//	{
//		// Create File object
//		File f = new File ("C:\\Users\\91776\\Desktop\\mob1.xlsx");
//		
//		// Created FileInputStream object
//		FileInputStream fis = new FileInputStream(f);
//		
//		// open workbook and create workbookfactory
//		Workbook wb= WorkbookFactory.create(fis);
//		
//		// Open A sheet
//		//Sheet sheet1 = wb.getSheet("Sheet1");
//		
//		Sheet sheet0 = wb.getSheetAt(0);
//		
//		Row row0 =sheet0.getRow(r);
//		Call Cell =  (Call) row0.getCell(c);
//		
//		return Cell;
//	     
//			
//		
//	}	  
//
//	        public static WebElement mousActions( WebDriver driver ,WebElement element) { 
//		
//	        	Actions act = new Actions(driver);
//			    WebElement element1 = (WebElement) act.moveToElement(element);
//		    	return element;
//	   }	
	        
}
