package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class WdHubStatusTests extends TestBase {
    @Test
    public void statusTest() {
        given()
                .log().all()
                .auth().basic("user1", "1234")
                .when()
                .get("/wd/hub/status")
                .then()
                .log().all()
                .body("value.message", is("Selenoid v2.1.0 built at 2026-06-28_12:20:34AM"));

    }
}
