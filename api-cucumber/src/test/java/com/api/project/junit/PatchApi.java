package com.api.project.junit;

import com.api.project.model.Address;
import com.api.project.model.FirstUser;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by alexeykozlov on 1/28/19.
 */
public class PatchApi {

  @Test
  public void patchJsonPlaceholder() {

    FirstUser user = new FirstUser();
    user.setFirsName("Sherlock");
    user.setLastName("Holmes");

    given()
            .contentType(ContentType.JSON)
            .when()
            .body(user)
            .patch("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200)
            .log()
            .all();

  }
}
