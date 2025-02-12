package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import com.example.demo.model.Response;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = MediaTypes.HAL_JSON_VALUE)
public class BasicController {

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get", description = "Provides a response.")
    @ApiResponse(content = @Content(mediaType = MediaTypes.HAL_JSON_VALUE,
        schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = Response.class)),
        responseCode = "200")
    public Response get() {

        return new Response("value");
    }

}
