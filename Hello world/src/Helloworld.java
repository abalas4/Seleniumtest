import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class Helloworld 
{

    public static void main(String[] args) 
    {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
    	driver = new ChromeDriver();
        String baseUrl = "http://localhost:5244/about";
        String expectedTitle = "about page";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        assert expectedTitle == actualTitle;
       
        System.out.println("actualtitle:"+actualTitle);
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }

}