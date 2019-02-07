package com.api.project.cucumber;

import io.restassured.http.Header;
import io.restassured.http.Headers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertyFileReader {

    private static Properties properties;

    private static PropertyFileReader reader = new PropertyFileReader();

    public static PropertyFileReader getInstance() {
        return reader;
    }


    private PropertyFileReader() {

        properties = new Properties();
        try {
            properties.load(PropertyFileReader.class.getClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Headers getFullHeader() {

        Header payload1 = new Header("Content-Type",properties.getProperty("ContentType"));
        Header payload2 = new Header("Accept-Charset",properties.getProperty("AcceptCharset"));
        Header payload3 = new Header("Alexey-Header",properties.getProperty("Alexey"));


        List<Header> headersList = new ArrayList<Header>();
        headersList.add(payload1);
        headersList.add(payload2);
        headersList.add(payload3);
        Headers headersTest = new Headers(headersList);

        return headersTest;
    }

    public static Headers getDynamicFullHeader() {

        Header payload1 = new Header("Content-Type",properties.getProperty("Content-Type"));
        Header payload2 = new Header("Accept-Charset",properties.getProperty("Accept-Charset"));
        Header payload3 = new Header("Alexey",properties.getProperty("Alexey"));
        Header dynamicHeader = new Header("DynamicPhone", RuntimeData.getInstance().getDynamicHeader());


        List<Header> headersList = new ArrayList<Header>();
        headersList.add(payload1);
        headersList.add(payload2);
        headersList.add(payload3);
        headersList.add(dynamicHeader);
        Headers headersTest = new Headers(headersList);

        return headersTest;
    }

    public static String getUrl(){
        return properties.getProperty("CommonURL");
    }
}
