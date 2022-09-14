import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void startTrello() {

        //System.setProperty("webdriver","C:/Users/julia/Downloads/chromedriver.exe");
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }

    WebElement el1 = wd.findElement(By.tagName("a"));
    WebElement el2 = wd.findElement(By.tagName("div"));
    WebElement el3 = wd.findElement(By.id("skip-to-content"));
    WebElement el4 = wd.findElement(By.className("visually-hidden"));
    WebElement el5 = wd.findElement(By.linkText("Log in"));

    //css
    WebElement elc1 = wd.findElement(By.cssSelector("#skip-to-content"));//id
    WebElement elc2 = wd.findElement(By.cssSelector(".visually-hidden"));//class
    WebElement elc3 = wd.findElement(By.cssSelector("[data-testid='smallnav']"));// [a='f']

    //xpath
    WebElement elx1= wd.findElement(By.xpath("//*[@id='skip-to-content']")); //id
    WebElement elx2= wd.findElement(By.xpath("//*[@class='visually-hidden']"));//class
    WebElement elx3= wd.findElement(By.xpath("//*[@data-testid='smallnav']"));// [a='g']
    WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));//+tagname




    // for log in
    WebElement li1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement lix1 = wd.findElement(By.xpath("//a[@href='/login']"));

    WebElement li2 = wd.findElement(By.cssSelector("#user"));
    WebElement lix2 = wd.findElement(By.xpath("//*[@id='user']"));

    WebElement li3 = wd.findElement(By.cssSelector("#login"));
    WebElement lix3 = wd.findElement(By.xpath("//*[@id='login']"));

    WebElement li4 = wd.findElement(By.cssSelector("#password"));
    WebElement lix4 = wd.findElement(By.xpath("//*[@id='password']"));

    WebElement li5 = wd.findElement(By.cssSelector("#login-submit"));
    WebElement lix5 = wd.findElement(By.xpath("//*[@id='login-submit']"));

    WebElement li6 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement lix6 = wd.findElement(By.xpath("//*[@data-test-id='header-member-menu-button']"));

    WebElement li7 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));
    WebElement lix7 = wd.findElement(By.xpath("//*[@class='m2N684FcksCyfT']"));

    //log out
    WebElement li8 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement li9 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    WebElement li10 = wd.findElement(By.cssSelector("#logout-submit"));

    //main page
    WebElement li11= wd.findElement(By.cssSelector("[href='/home']"));
    WebElement li12= wd.findElement(By.cssSelector("[data-testid='logo_link']"));
    WebElement li13= wd.findElement(By.cssSelector("[data-testid='bignav-tab']"));

    //starts/contains-ends(css)
    WebElement el557 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
    WebElement el559 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends
    WebElement el558 = wd.findElement(By.cssSelector("[aria-label ^='Tr']")); //starts
    WebElement el57 = wd.findElement(By.cssSelector("[aria-label *='rell']")); //contains

    //starts/contains-ends(xpath)
    WebElement elxp1 = wd. findElement(By.xpath("//*[@aria-label='Trello']"));
    WebElement elxp2 = wd.findElement(By.xpath("//*[contains(@aria-label,'rel')]"));//contains
    WebElement elxp3 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Tr')]"));//

    //div[@class='first' and @class='list']

}
