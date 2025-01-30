package StepDepfinitaion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class multiThread implements Runnable{
    private String browser;
    public multiThread(String browser){
        this.browser = browser;
    }
    
    @Override
    public void run(){
        WebDriver driver = null;
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\18042\\chromedriver.exe"); 
            driver = new ChromeDriver();
        }else if(browser.equals("Edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\18042\\msedgedriver.exe");
            driver = new EdgeDriver();
     
        }
        if(driver != null){
            driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
            System.out.println("Title in " + browser + ": " + driver.getTitle());
            driver.quit();
        }   
    }
}
