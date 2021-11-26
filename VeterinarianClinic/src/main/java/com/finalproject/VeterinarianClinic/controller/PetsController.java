package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.finalproject.VeterinarianClinic.entities.Pets;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;



@Validated
@RequestMapping("/Pets")
@OpenAPIDefinition(
    info = @Info(title = "Pets Service"), servers = {
            @Server(url = "http://localhost:8080", description = "Local server.")})


public interface PetsController {
//@formatter:off
  
  
  @Operation(
      summary = "Returns pets",
      description = "Returns pets",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "Pets are returned",
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Pets.class))),
          @ApiResponse(
              responseCode = "404",
              description = "No pets found",
              content = @Content(
                  mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "An unplanned error occurred",
              content = @Content(
                  mediaType = "application/json"))
      
      }
      )
   @GetMapping
   @ResponseStatus(code = HttpStatus.OK)
   List<Pets> getPets();
  // @formatter:on */


}
