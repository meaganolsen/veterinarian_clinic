package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

//@formatter:off
 @Operation(
     summary = "Create a pet",
     description = "Returns the created pet",
     responses = {
         @ApiResponse(
             responseCode = "201", 
             description = "The created pet is returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Pets.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404", 
             description = "A bill could not be generated", 
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred", 
             content = @Content(mediaType = "application/json"))
     }
     )
     
     @PostMapping
     @ResponseStatus(code = HttpStatus.CREATED)
  Pets postPets(@Valid @RequestBody Pets pets);
    
//@formatter:off
@Operation(
    summary = "Update a pet",
    description = "Returns the updated pet",
    responses = {
        @ApiResponse(
            responseCode = "200", 
            description = "The updated pet is returned", 
            content = @Content(
                mediaType = "application/json", 
                schema = @Schema(implementation = Pets.class))),
        @ApiResponse(
            responseCode = "400", 
            description = "The request parameters are invalid", 
            content = @Content(
                mediaType = "application/json")),
        @ApiResponse(
            responseCode = "404", 
            description = "An updated pet could not be generated", 
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "500", 
            description = "An unplanned error occurred", 
            content = @Content(mediaType = "application/json"))
  }
  )
  
  @PutMapping
  @ResponseStatus(code = HttpStatus.OK)
Pets updatePets(@Valid @RequestBody Pets pets);
 
//@formatter:off
@Operation(
    summary = "Delete an pet",
    description = "Returns the deleted pet",
    responses = {
        @ApiResponse(
            responseCode = "200", 
            description = "The deleted pet is returned", 
            content = @Content(
                mediaType = "application/json", 
                schema = @Schema(implementation = Pets.class))),
        @ApiResponse(
            responseCode = "400", 
            description = "The request parameters are invalid", 
            content = @Content(
                mediaType = "application/json")),
        @ApiResponse(
            responseCode = "404", 
            description = "A deleted pet could not be generated", 
            content = @Content(mediaType = "application/json")),
        @ApiResponse(
            responseCode = "500", 
            description = "An unplanned error occurred", 
            content = @Content(mediaType = "application/json"))
}
)

@DeleteMapping
@ResponseStatus(code = HttpStatus.OK)
Pets deletePets(@Valid @RequestBody Pets pets);
  // @formatter:on */


}
