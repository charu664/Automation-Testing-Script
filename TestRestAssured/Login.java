package TestRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class Login    {

   private  APIToken obj = new APIToken();

    private static String tokenId;


    @BeforeClass
    @Test(priority = 1)
    public void signin() {
        HashMap data = new HashMap();
        data.put("email", "admin@portalbigmo.com ");
        data.put("password", "P@rtal@D#42");
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://portal.bigmofxcrm.com:8087/api/app/signin")
                .then()
                .log().body()
                .extract().response();
        System.out.println(res);
        JSONObject obj = new JSONObject(res.asString());

        System.out.println(obj.get("token"));
        tokenId = obj.get("token").toString();
        Assert.assertEquals(res.statusCode(), 200);
    }
    @Test(priority = 2)
    public void GetMeApiUser() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/me")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 3)
    public void GetUserAccountDetilas() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/accountdetails")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 4)
    public void GetTransactionNewUserSide() {
        HashMap data = new HashMap();
        data.put("pageIndex", "1");
        data.put("pageSize", "5");
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/transaction/getTransactionNew?pageIndex=1&pageSize=5")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 5)
    public void UserVerification() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .post("https://portal.bigmofxcrm.com:8087/api/app/proof")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 6)
    public void UserVerificationOwn() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/proof/own")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 7)
    public void GetMeApiAdmin() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get( "https://portal.bigmofxcrm.com:8087/api/app/me")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 8)
    public void AdminAccountDetails() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get( "https://portal.bigmofxcrm.com:8087/api/app/accountdetails")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 9)
    public void GetTrancationNewAdminSide() {
        HashMap data = new HashMap();
        data.put("pageIndex", "1");
        data.put("pageSize", "5");
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get( "https://portal.bigmofxcrm.com:8087/api/app/transaction/getTransactionNew?pageIndex=1&pageSize=5")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }


    @Test(priority = 10)
    public void UserList() {
        HashMap data = new HashMap();
        data.put("pageNumber", "1");
        data.put("pageSize", "10");
        System.out.println(tokenId);
        Response res =
                given()
                .headers("Authorization","Bearer " + tokenId)
                .when()
                .get("https://portal.bigmofxcrm.com:8087/api/app/usersList?pageNumber=1&pageSize=10&searchParam=")
                .then()
                        .contentType("application/json")
                .log().body()
                .extract().response();
        Assert.assertEquals(res.getStatusCode(), 200);

    }
    @Test(priority = 11)
    public void ProofAdminVerification() {
        HashMap data = new HashMap();
        data.put("pageIndex", "1");
        data.put("pageSize", "10");
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/proof/Admin?pageIndex=1&pageSize=10&searchParam=")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }

    @Test(priority = 12)
    public void RequestByIdAdminSide() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/proof/requestById?id=10")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 13)
    public void TransactionGraphAdmin() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/transaction/getTransactioGraph")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 14)
    public void UserGraph() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/usersgraph")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
//    @Test(priority = 15)
//    public void IbUser() {
//        System.out.println(tokenId);
//        Response response =
//                given()
//                        .headers("Authorization","Bearer " + tokenId)
//                        .when()
//                        .post("https://backoffice.bigmofxcrm.com:8086/api/app/ib")
//                        .then()
//                        .contentType("application/json")
//                        .extract()
//                        .response();
//        response.then().log().all();
//        Assert.assertEquals(response.statusCode(), 200);
//    }
    @Test(priority = 16)
    public void IbUserown() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/ib/own")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
//    @Test(priority = 17)
//    public void PaymentUserSide() {
//        HashMap data = new HashMap();
//        data.put("FormFile", "binary");
//        data.put("Type", "ExtToWallet");
//        data.put("Amount", "1000");
//        data.put("Currency", "USD");
//        data.put("Comment", "Deposit  1000");
//        data.put("PaymentMethod", "By Cash");
//        data.put("Login", "");
//           System.out.println(tokenId);
//        Response res =
//                given()
//                .headers("Authorization","Bearer " + tokenId)
//                .contentType("application/json")
//                .body(data)
//                .when()
//                .put("https://crm.bigmofx.com:8087/api/app/transaction/deposit")
//                .then()
//                .log().body()
//                .extract().response();
//        Assert.assertEquals(res.statusCode(), 200);
//    }
    @Test(priority = 18)
    public void IbStatusRequest() {
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/ib?status=Approved")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 19)
    public void IbClientNewUserSide() {
        HashMap data = new HashMap();
        data.put("pageIndex", "1");
        data.put("pageSize", "10");
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get( "https://portal.bigmofxcrm.com:8087/api/app/ib/clientsNew?pageIndex=1&pageSize=10&searchParam=")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
    @Test(priority = 20)
    public void GetIbUserAdminSide() {
        HashMap data = new HashMap();
        data.put("pageIndex", "1");
        data.put("pageSize", "10");
        System.out.println(tokenId);
        Response response =
                given()
                        .headers("Authorization","Bearer " + tokenId)
                        .when()
                        .get("https://portal.bigmofxcrm.com:8087/api/app/ib/GetIbUsers?pageIndexp=1&pageSize=10&searchParam=")
                        .then()
                        .contentType("application/json")
                        .extract()
                        .response();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 200);
    }
}
