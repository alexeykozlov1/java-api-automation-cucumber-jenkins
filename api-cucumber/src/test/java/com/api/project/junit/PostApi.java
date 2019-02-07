package com.api.project.junit;

import com.api.project.model.Address;
import com.api.project.model.FirstUser;
import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

/**
 * Created by alexeykozlov on 1/10/19.
 * <p>
 * {
 * "firsName": "Sherlock",
 * "lastName":"Holmes",
 * "address": {
 * "streetAddress": "Baker St",
 * "phone": 123456789,
 * "email": "123@gmail.com"
 * }
 * }
 */
public class PostApi {


  @Test
  public void postJsonPlaceholder() {

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
            .post("https://jsonplaceholder.typicode.com/users")
            .then()
            .statusCode(201)
            .log()
            .all();

  }
}
