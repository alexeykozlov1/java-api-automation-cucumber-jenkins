package com.api.project.junit;

import com.api.project.model.Address;
import com.api.project.model.FirstUser;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {

  @Test
  public void putJsonPlaceholder() {

    Address address = new Address();
    address.setStreetAddress("Baker St");
    address.setPhone(123456789);
    address.setEmail("123@gmail.com");

    FirstUser user = new FirstUser();
    user.setFirsName("Sherlock");
    user.setLastName("Holmes");
    user.setAddressObject(address);


    given()
            .contentType(ContentType.JSON)
            .when()
            .body(user)
            .put("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200)
            .log()
            .all();

  }
}
