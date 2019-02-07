package com.api.project.junit;

import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by alexeykozlov on 1/28/19.
 */
public class DeleteApi {
  @Test
  public void deleteJsonPlaceholder(){
    given()
            .when()
            .delete("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200)
            .log()
            .all();

  }
}
