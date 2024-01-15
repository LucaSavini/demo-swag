package com.example.demoswagger.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class Controllers {

    @Operation(summary = "Sommario x ", description = "Ritorna un nome")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
            @ApiResponse(responseCode = "404", description = "Not found ")
    })

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return "Nome: " + name;
    }

    @PostMapping("/reverse_name")
    public String reverseName(@RequestParam String name) {
        StringBuilder reversedName = new StringBuilder(name).reverse();
        return "Nome al contrario: " + reversedName.toString();
    }
}

