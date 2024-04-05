package browsersetup;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import browserPage.signuppage;
import org.testng.annotations.Test;
public class Signupform {
    WebDriver driver;
    @Test
    public void signup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        driver.get("https://portal.thecoremarkets.com/user/login");

        signuppage signup = new signuppage(driver);
//        signup.getStared();
//        signup.enterfirstname();
//        signup.enterlastname();
//        signup.enterEmail();
//        signup.enternumber();
//        signup.country();
//        signup.clickcountry();
//        signup.enterPasswrod();
//        signup.enterpromo();
//        signup.clickcheckbox();
//        signup.button();
          signup.useremail();
          signup.userpassword();
          signup.signin();
          signup.dashboard();
          signup.Profilesetting();
          signup.mydetails();
//        signup.editbutton();
//        signup.editname();
//        signup.editlastname();
//        signup.editemail();
//        signup.editpass();
//        signup.editphone();
//        signup.submitbutton();
//        signup.cancelbutton();
          signup.backbutton();
          signup.verification();
//        signup.flip();
//        signup.upload();
//        signup.submit();
          signup.BACKBUTTON();
//        signup.Logoutbutton();
//        signup.logout();
//        signup.Useremail1();
//        signup.Userpassword1();
//        signup.Signin1();
//        signup.Useradmin();
//        signup.Userverification();
//        signup.Adminlog();
//        signup.Adminlogo();
//        signup.Useremail2();
//        signup.Userpassword2();
//        signup.Signin2();
//        signup.Profilesetting2();
          signup.changepss();
//        signup.Oldpass();
//        signup.newpass();
//        signup.Confipass();
//        signup.updatepass();
          signup.Backbuttonchnagepass();
//        signup.Transaction();
//        signup.Deposit();
//        signup.Wallet();
//        signup.item();
//        signup.itemselect();
//        signup.Selectbank();
//        signup.amount();
//        signup.paybutton();
//        signup.Backb();
//        signup.Mt5account();




    }
}

