package com.api.project.junit;


import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by alexeykozlov on 1/9/19.
 */
public class GetApi {
  @Test
  public void makeSureThatGoogleIsUp() {
    Response response = given()
            .when()
            .get("https://jsonplaceholder.typicode.com/users/1");

    System.out.println(response.body().asString());


  }

  @Test
  public void statusCode(){
    given()
            .when()
            .get("https://jsonplaceholder.typicode.com/users/1")
            .then()
            .statusCode(200);
  }
}
