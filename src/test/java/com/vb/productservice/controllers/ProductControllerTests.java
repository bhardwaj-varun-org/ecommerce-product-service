package com.vb.productservice.controllers;

import com.vb.productservice.Constants;
import com.vb.productservice.models.Product;
import com.vb.productservice.support.AbstractIntegrationTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.*;


import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;


public class ProductControllerTests extends AbstractIntegrationTest {

    @Test
    @DisplayName("Should get all the products")
    void shouldGetAllProducts(){
        //Arrange
        List<Product> products =  List.of(
                Product.builder().name("Head First Python").description("A book on python").code("abc_001").build(),
                Product.builder().name("Head First Java").description("A book on java").code("abc_002").build()
        );
        //act
        productRepository.saveAll(products);

        //assert
        given(requestSpecification)
                .contentType(ContentType.JSON)
                .when()
                .get(Constants.PRODUCTS_ENDPOINT)
                .then()
                .statusCode(200)
                .body(".", hasSize(2));
    }

}
