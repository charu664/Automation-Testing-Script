package browsersetup;
import org.openqa.selenium.WebDriver;
import browserPage.signuppage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
public class Signupform    {
    WebDriver driver;
    signuppage signuppage;
    @BeforeMethod
    public void signup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        signuppage = new signuppage(driver);
        driver.get("https://backend.crownstonecrm.com/user/login");
    }
    @Test
    public void signupTest() {
        signuppage.getStared();
        signuppage.enterfirstname();
        signuppage.enterlastname();
        signuppage.enterEmail();
        signuppage.enternumber();
        signuppage.country();
        signuppage.clickcountry();
        signuppage.enterPasswrod();
        signuppage.enterpromo();
        signuppage.clickcheckbox();
//        signuppage.button();
//        signuppage.useremail();
//        signuppage.userpassword();
//        signuppage.signin();
//        signuppage.dashboard();
//        signuppage.Profilesetting();
//        signuppage.mydetails();
//        signuppage.editbutton();
//        signuppage.editname();
//        signuppage.editlastname();
//        signuppage.editemail();
//        signuppage.editpass();
//        signuppage.editphone();
//        signuppage.submitbutton();
//        signuppage.cancelbutton();
//        signuppage.backbutton();
//        signuppage.verification();
//        signuppage.flip();
//        signuppage.upload();
//        signuppage.submit();
//        signuppage.BACKBUTTON();
//        signuppage.Logoutbutton();
//        signuppage.logout();
//        signuppage.Useremail();
//        signuppage.userpassword1();
//        signuppage.Signin1();
//        signuppage.Useradmin();
//        signuppage.Userverification();
//        signuppage.Adminlog();
//        signuppage.Adminlogo();
//        signuppage.Useremail2();
//        signuppage.Userpassword2();
//        signuppage.Signin2();
//        signuppage.Profilesetting2();
//        signuppage.changepss();
//        signuppage.Oldpass();
//        signuppage.newpass();
//        signuppage.Confipass();
//        signuppage.updatepass();
//        signuppage.Backbuttonchnagepass();
//        signuppage.Transaction();
//        signuppage.Deposit();
//        signuppage.Wallet();
//        signuppage.item();
//        signuppage.itemselect();
//        signuppage.selectbank();
//        signuppage.amount();
//        signuppage.paybutton();
//        signuppage.Backb();
//        signuppage.Mt5account();
//        }
//  }
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }}


