package org.acme;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Disabled
    @Test
    public void testHelloNameEndpoint() {
        given()
            .when().get("/hello/john")
            .then()
                .assertThat()
                    .statusCode(200)            
                .and()
                    .body("ami", is("john")); 
    }

}