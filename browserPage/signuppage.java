package browserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class signuppage {
    WebDriver driver;
//  @FindBy(xpath = "//a[contains(text(),'Sign up')]")
//  WebElement getStared;
//  @FindBy (xpath="//input[@id='firstName']")
//  WebElement firstName;
//  @FindBy(xpath="//input[@id='lastName']")
//  WebElement lastName;
//  @FindBy(xpath="//input[@id='email']")
//  WebElement email;
//  @FindBy(xpath="//input[@placeholder='Phone number']")
//  WebElement phonenumber;
//  @FindBy(xpath ="//div[@class=\"ant-select-selector\"]")
//  WebElement country;
//  @FindBy(xpath ="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
//  WebElement countryname;
//  @FindBy(xpath="//input[@id='password']")
//  WebElement password;
//  @FindBy(xpath=" //input[@id='promo']")
//  WebElement promo;
//  @FindBy(xpath="//input[@class='ant-checkbox-input']")
//  WebElement checkbox;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-2q8sxy ant-btn-primary ant-btn-lg\"]")
//  WebElement button;
    @FindBy(xpath = "//input[@placeholder='Please input your email address!']")
    WebElement useremail;
    @FindBy(xpath = "//input[@placeholder='Please input your password!']")
    WebElement userpassword;
    @FindBy(xpath = "//button[@class=\"ant-btn css-2q8sxy ant-btn-primary ant-btn-lg\"]")
    WebElement signin;
    @FindBy(xpath = "//ul//li[@class='ant-menu-item ant-menu-item-selected ant-menu-item-only-child ant-pro-base-menu-inline-menu-item']")
    WebElement dashboard;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/aside[1]/div[1]/div[1]/ul[1]/li[2]")
    WebElement profilesetting;
    @FindBy(xpath = "//div[@class=\"My-Details\"]")
    WebElement mydetails;
//  @FindBy(xpath = "//button[@class='ant-btn css-1799cdp ant-btn-button mydetails-btn']")
//  WebElement editbutton;
//  @FindBy(xpath = "//input[@id=\"firstName\"]")
//  WebElement editname;
//  @FindBy(xpath = "//input[@id=\"lastName\"]")
//  WebElement editlastname;
//  @FindBy(xpath = "//input[@id=\"email\"]")
//  WebElement editemail;
//  @FindBy(xpath="//input[@id="password"]")
//  WebElement editpass;
//  @FindBy(xpath = "//input[@id=\"phone\"]")
//  WebElement editphone;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-1799cdp ant-btn-submit mydetails-btn\"]")
//  WebElement submitbutton;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-1799cdp ant-btn-button mydetails-btn\"]")
//  WebElement cancelbutton;
    @FindBy(xpath = "//button//span[contains(text(),'Back')]")
    WebElement backbutton;
    @FindBy(xpath = "//div[@class=\"verification\"]")
    WebElement verification;
//  @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/main[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]")
//  WebElement flip;
//  @FindBy(xpath = "//input[@id='idProofFile']")
//  WebElement upload;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-1799cdp ant-btn-button ver-btn\"]")
//  WebElement submit;
    @FindBy(xpath="//button//span[contains(text(),'Back')]")
    WebElement BACKBUTTON;
//    @FindBy(xpath = "//span[contains(text(),'Ashish Kadam')]")
//    WebElement Logoutbutton;
//    @FindBy(xpath = "//span[contains(text(),'Logout')]")
//    WebElement logout;
//  @FindBy(xpath = "//input[@placeholder='Please input your email address!']")
//  WebElement useremail1;
//  @FindBy(xpath = "//input[@placeholder='Please input your password!']")
//  WebElement userpassword1;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-2q8sxy ant-btn-primary ant-btn-lg\"]")
//  WebElement signin1;
//  @FindBy(xpath ="//li[@class='ant-menu-item ant-menu-item-active ant-menu-item-only-child ant-pro-base-menu-inline-menu-item']")
//  WebElement useradmin;
//  @FindBy(xpath = "//div[@id="rc-tabs-1-tab-2"]")
//  WebElement userverification;
//  @FindBy(xpath = "//span[@class="username"]")
//  WebElement adminlog;
//  @FindBy(xpath = "//li[@class="ant-dropdown-menu-item ant-dropdown-menu-item-active"]")
//  WebElement adminlogo;
//  @FindBy(xpath = "//input[@placeholder='Please input your email address!']")
//  WebElement useremail2;
//  @FindBy(xpath = "//input[@placeholder='Please input your password!']")
//  WebElement userpassword2;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-2q8sxy ant-btn-primary ant-btn-lg\"]")
//  WebElement signin2;
//  @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/aside[1]/div[1]/div[1]/ul[1]/li[2]")
//  WebElement profilesetting2;
    @FindBy(xpath = "//div[@class=\"change-pswd\"]")
    WebElement changepass;
//  @FindBy(xpath = "//input[@id=\"basic_oldPassword\"]")
//  WebElement oldpass;
//  @FindBy(xpath = "//input[@id=\"basic_newPassword\"]")
//  WebElement newpass;
//  @FindBy(xpath = "//input[@id=\"basic_Confirm Password\"]")
//  WebElement confipass;
//  @FindBy(xpath = "//button[@class=\"ant-btn css-1799cdp ant-btn-button updatepassword-btn\"]")
//  WebElement updatepass;
    @FindBy(xpath="//button//span[contains(text(),'Back')]")
    WebElement backbuttonchnagepass;
//    @FindBy(xpath="//div[@class=\"ant-menu-submenu-title\"]")
//    WebElement Transaction;
//    @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/aside[1]/div[1]/div[1]/ul[1]/li[3]/ul[1]/li[1]")
//    WebElement Deposit;
//    @FindBy(xpath = "//div[@class=\"wallet-cls\"]")
//    WebElement wallet;
//    @FindBy(xpath ="//div[@class=\"ant-select selectForm form-control css-1799cdp ant-select-single ant-select-show-arrow\"]")
//    WebElement item;
//    @FindBy(xpath = "//div[@class=\"ant-select-item ant-select-item-option\"]")
//    WebElement itemselect;
//    @FindBy(xpath="//button//span[contains(text(),'Select')] [1]")
//    WebElement selectbank;
//  @FindBy(xpath = "//input[@id=\"basic_amount\"]")
//  WebElement amount;
//  @FindBy(xpath = "//div//button[@type=\"submit\"]")
//  WebElement paybutton;
//    @FindBy(xpath="//div//button[@class='ant-btn css-1799cdp ant-btn-button back-btn']")
//    WebElement backb;
    //    @FindBy(xpath ="//div[@class=\"mt5-cls\"]")
//    WebElement Mt5account;
    public signuppage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//  public void getStared(){getStared.click();}
//  public void enterfirstname() {firstName.sendKeys("Ashish");}
//  public void enterlastname() {lastName.sendKeys("Kadam");}
//  public void enterEmail() {email.sendKeys("Ashish@gmail.com"}
//  public void enternumber() {phonenumber.sendKeys("9587452136");}
//  public void country(){country.click();}
//  public void clickcountry(){countryname.click();}
//  public void enterPasswrod() {password.sendKeys("Ashish#10");}
//  public void enterpromo() {promo.sendKeys("0");}
//  public void clickcheckbox() {checkbox.click();}
//  public void button() {button.click();}
    public void useremail() {useremail.sendKeys("Ashish@gmail.com");}
    public void userpassword() {userpassword.sendKeys("Pranit@3223");}
    public void signin() {signin.click();}
    public void dashboard(){dashboard.click();}
    public void Profilesetting() {profilesetting.click();}
    public void mydetails() {mydetails.click();}
//  public void editbutton() {editbutton.click();}
//  public void editname() {editname.sendKeys("pranit");}
//  public void editlastname() {editlastname.sendKeys("patil");}
//  public void editemail(){editemail.sendKeys("pranit21@gmail.com");}
//  public void editpass(){editpass.sendKeys("Pranit@30");}
//  public void editphone(){editphone.sendKeys("9741230147");}
//  public void submitbutton(){submitbutton.click();}
//  public void cancelbutton() {cancelbutton.click();}
    public void backbutton() {backbutton.click();}
    public void verification() {verification.click();}
//  public void flip() {flip.click();}
//  public void upload() {upload.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Desktop\\test.jpg");}
//  public void submit() {submit.click();}
    public void BACKBUTTON(){BACKBUTTON.click();}
//  public void Logoutbutton(){Logoutbutton.click();}
//  public void logout(){logout.click();}
//  public void Useremail1(){useremail1.sendKeys("admin@coremarkets.com");}
//  public void Userpassword1(){userpassword1.sendKeys("Coremarkets@1231");}
//  public void Signin1(){signin1.click();}
//  public void Useradmin(){useradmin.click();}
//  public void Userverification(){userverification.click();}
//  public void Adminlog(){adminlog.click();}
//  public void Adminlogo(){adminlogo.click();}
//  public void Useremail2(){useremail2.sendKeys("Ashish@gmail.com");}
//  public void Userpassword2(){userpassword2.sendKeys("Pranit@3223");}
//  public void Signin2(){signin2.click();}
//  public void Profilesetting2(){profilesetting2.click();}
    public void changepss(){changepass.click();}
//  public void Oldpass(){oldpass.sendKeys("Ashish#10");}
//  public void newpass(){newpass.sendKeys("Pranit@3223");}
//  public void Confipass(){confipass.sendKeys("Pranit@3223");}
//  public void updatepass(){updatepass.click();}
    public void Backbuttonchnagepass(){backbuttonchnagepass.click();}
//  public void Transaction(){Transaction.click();}
//  public void Deposit(){Deposit.click();}
//  public void Wallet(){wallet.click();}
//  public void item(){item.click();}
//  public void itemselect(){itemselect.click();}
//  public void Selectbank(){selectbank.click();}
//  public void amount(){amount.sendKeys("100");}
//  public void paybutton(){paybutton.click();}
//  public void Backb(){backb.click();}
//  public void Mt5account(){Mt5account.click();}
}








