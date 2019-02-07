package com.api.project.util;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiIntegrationUtil {

    private static ApiIntegrationUtil apiIntegrationUtil = new ApiIntegrationUtil();
    //initiate the object

    public static ApiIntegrationUtil getInstance() {
        return apiIntegrationUtil;
    }

    public Response createPostRequest(RequestSpecification request, Object requestBody, String apiPath) {
        return request.body(requestBody).log().body().post(apiPath);
    }

    private ApiIntegrationUtil() {
    }
//no other ways to create the instance of the class can be created for that object
}
