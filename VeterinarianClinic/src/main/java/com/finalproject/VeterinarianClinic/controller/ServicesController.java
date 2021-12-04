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
import com.finalproject.VeterinarianClinic.entities.Services;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/Services")
@OpenAPIDefinition(
    info = @Info(title = "Services Service"), servers = {
        @Server(url = "http://localhost:8080", description = "Local server.")})

public interface ServicesController {
  
  
  //@formatter:off  
    
          
    @Operation(
        summary = "Return services",
        description = "Return services",
        responses = {
            @ApiResponse(
                responseCode = "200", 
                description = "Services are returned", 
                content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = Services.class))),
            @ApiResponse(
                responseCode = "404", 
                description = "No services found", 
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
    List<Services> getServices();
       
  //@formatter:off
    @Operation(
        summary = "Create a service",
        description = "Returns the created service",
        responses = {
            @ApiResponse(
                responseCode = "201", 
                description = "The created service is returned", 
                content = @Content(
                    mediaType = "application/json", 
                    schema = @Schema(implementation = Services.class))),
            @ApiResponse(
                responseCode = "400", 
                description = "The request parameters are invalid", 
                content = @Content(
                    mediaType = "application/json")),
            @ApiResponse(
                responseCode = "404", 
                description = "A service could not be generated", 
                content = @Content(mediaType = "application/json")),
            @ApiResponse(
                responseCode = "500", 
                description = "An unplanned error occurred", 
                content = @Content(mediaType = "application/json"))
        }
        )
        
        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
     Services postServices(@Valid @RequestBody Services services);
       
  //@formatter:off
    @Operation(
       summary = "Update a service",
       description = "Returns the updated service",
       responses = {
           @ApiResponse(
               responseCode = "200", 
               description = "The updated service is returned", 
               content = @Content(
                   mediaType = "application/json", 
                   schema = @Schema(implementation = Services.class))),
           @ApiResponse(
               responseCode = "400", 
               description = "The request parameters are invalid", 
               content = @Content(
                   mediaType = "application/json")),
           @ApiResponse(
               responseCode = "404", 
               description = "An updated service could not be generated", 
               content = @Content(mediaType = "application/json")),
           @ApiResponse(
               responseCode = "500", 
               description = "An unplanned error occurred", 
               content = @Content(mediaType = "application/json"))
       }
       )
       
       @PutMapping
       @ResponseStatus(code = HttpStatus.OK)
    Services updateServices(@Valid @RequestBody Services services);
      
    
    @Operation(
     summary = "Delete a service",
     description = "Returns the deleted service",
     responses = {
         @ApiResponse(
             responseCode = "200", 
             description = "The deleted service is returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Services.class))),
         @ApiResponse(
             responseCode = "400", 
             description = "The request parameters are invalid", 
             content = @Content(
                 mediaType = "application/json")),
         @ApiResponse(
             responseCode = "404", 
             description = "A deleted service could not be generated", 
             content = @Content(mediaType = "application/json")),
         @ApiResponse(
             responseCode = "500", 
             description = "An unplanned error occurred", 
             content = @Content(mediaType = "application/json"))
     }
     )
     
     @DeleteMapping
     @ResponseStatus(code = HttpStatus.OK)
    Services deleteServices(@Valid @RequestBody Services services);




    //@formatter:on */



   }




     

    

