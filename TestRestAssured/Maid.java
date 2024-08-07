package TestRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
public class Maid {
    private Token obj = new Token();
    private static String TOKENID;

    @Test(priority = 1)
    public void Register() {
        HashMap data = new HashMap();
        data.put("username", "Charu");
        data.put("password", "Charu@12345");
        data.put("email", "charu12@gmail.com");
        data.put("role", "USER");
        data.put("flatSizeId", "1");
        data.put("numPeople", "4");
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("http://localhost:8080/users/register")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            TOKENID = responseString;
            System.out.println("Token: " + TOKENID);
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 2)
    public void signin() {
        HashMap data = new HashMap();
        data.put("username", "Charu");
        data.put("password", "Charu@12345");
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("http://localhost:8080/users/login")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            TOKENID = responseString;
            System.out.println("Token: " + TOKENID);
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 3)
    public void service() {
        HashMap data = new HashMap();
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .get("http://localhost:8080/api/service")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            TOKENID = responseString;
            System.out.println("Token: " + TOKENID);
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 4)
    public void booking() {
        HashMap data = new HashMap();
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .get("http://localhost:8080/api/bookings/user/8" +
                        "?start=2024-07-23&end=2024-08-23")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            TOKENID = responseString;
            System.out.println("Token: " + TOKENID);
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 5)
    public void Discount() {
        Map<String, Object> payload = new HashMap<>();
        Map<String, Object> user = new HashMap<>();
        user.put("id", 8);
        Map<String, Object> serviceType = new HashMap<>();
        serviceType.put("id", 3);
        Map<String, Object> timeslot = new HashMap<>();
        timeslot.put("id", 1);
        Map<String, Object> serviceRateId = new HashMap<>();
        serviceRateId.put("id", 7);
        payload.put("user", user);
        payload.put("serviceType", serviceType);
        payload.put("timeslot", timeslot);
        payload.put("serviceRateId", serviceRateId);
        payload.put("startDate", "2024-07-30");
        payload.put("active", true);
        payload.put("subscriptionType", "YEARLY");
        Response res = RestAssured.given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("http://localhost:8080/api/bookings/discount")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 6)
    public void Subcription() {
        Map<String, Object> payload = new HashMap<>();
        Map<String, Object> user = new HashMap<>();
        user.put("id", 8);
        Map<String, Object> serviceType = new HashMap<>();
        serviceType.put("id", 3);
        Map<String, Object> timeslot = new HashMap<>();
        timeslot.put("id", 4);
        Map<String, Object> payments = new HashMap<>();
        payments.put("id", 1);
        payload.put("user", user);
        payload.put("serviceType", serviceType);
        payload.put("timeslot", timeslot);
        payload.put("payments", payments);
        payload.put("startDate", "2024-07-30");
        payload.put("endDate", "2025-07-21");
        payload.put("active", true);
        payload.put("subscriptionType", "YEARLY");
        payload.put("work_type", "ALLROUNDER");
        Response res = RestAssured.given()
                .contentType("application/json")
                .body(payload)
                .when()
                .post("http://localhost:8080/api/subscriptions")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
    @Test(priority = 7)
    public void userall() {
        HashMap data = new HashMap();
        Response res = given()
                .contentType("application/json")
                .body(data)
                .when()
                .get("http://localhost:8080/users/8")
                .then()
                .log().body()
                .extract().response();
        String responseString = res.asString();
        System.out.println("Response: " + responseString);
        try {
            TOKENID = responseString;
            System.out.println("Token: " + TOKENID);
            Assert.assertEquals(res.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Failed to process the response. Response received: " + responseString);
        }
    }
}



