package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

import org.springframework.hateoas.RepresentationModel;

@Schema(description = "test description")
public class Response extends RepresentationModel<Response> {

    private String value2;

    public Response(String value2) {
        this.value2 = value2;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
}
