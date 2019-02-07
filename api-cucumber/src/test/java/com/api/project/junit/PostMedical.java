package com.api.project.junit;

import com.api.project.model.medicalPojo.AssociatedDrug;
import com.api.project.model.medicalPojo.AssociatedDrug2;
import com.api.project.model.medicalPojo.ClassName;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostMedical {

  @Test
  public void postJsonPlaceholder() {
//    "className":[{
//      "associatedDrug":[{
//        "name":"asprin",
//                "dose":"",
//                "strength":"500 mg"
//      }],
//      "associatedDrug2":[{
//        "name":"somethingElse",
//                "dose":"",
//                "strength":"500 mg"
//      }]
//    }]

//    as object {}
    AssociatedDrug assDrug1 = new AssociatedDrug();
    assDrug1.setName("asprin");
    assDrug1.setDose(" ");
    assDrug1.setStrength("500 mg");

//    as object {}
    AssociatedDrug2 assDrug2 = new AssociatedDrug2();
    assDrug2.setName("somethingElse");
    assDrug2.setDose(" ");
    assDrug2.setStrength("500 mg");

// as array []
    AssociatedDrug[] associatedDrugs1 = new AssociatedDrug[1];
    associatedDrugs1[0] = assDrug1;

//    as array []
    AssociatedDrug2[] associatedDrugs2 = new AssociatedDrug2[1];
    associatedDrugs2[0] = assDrug2;

//    as object {}
    ClassName className = new ClassName();
    className.setAssociatedDrug(associatedDrugs1);
    className.setAssociatedDrug2(associatedDrugs2);


    given()
            .contentType(ContentType.JSON)
            .when()
            .body(className)
            .post("https://jsonplaceholder.typicode.com/users")
            .then()
            .statusCode(201)
            .log()
            .all();
  }
}
