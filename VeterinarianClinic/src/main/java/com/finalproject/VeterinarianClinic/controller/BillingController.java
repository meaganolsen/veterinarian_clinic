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
import com.finalproject.VeterinarianClinic.entities.Billing;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/Billing")
@OpenAPIDefinition(info = @Info(title = "Billing Service"),
    servers = {@Server(url = "http://localhost:8080", description = "Local server.")})

public interface BillingController {
//@formatter:off  
  
  
  @Operation(
      summary = "Return billing",
      description = "Return billing",
      responses = {
          @ApiResponse(
          responseCode = "200", 
              description = "Billing is returned", 
              content = @Content(
                  mediaType = "application/json",
                  schema = @Schema(implementation = Billing.class))),
          @ApiResponse(
              responseCode = "404", 
              description = "No billing found", 
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
  List<Billing> getBilling();
      
  
//@formatter:off
 @Operation(
     summary = "Create a bill",
     description = "Returns the created bill",
     responses = {
         @ApiResponse(
             responseCode = "201", 
             description = "The created bill is returned", 
             content = @Content(
                 mediaType = "application/json", 
                 schema = @Schema(implementation = Billing.class))),
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
  Billing postBilling(@Valid @RequestBody Billing billing);
 
//@formatter:off
@Operation(
   summary = "Update billing",
   description = "Returns the updated billing",
   responses = {
       @ApiResponse(
           responseCode = "201", 
           description = "The updated billing is returned", 
           content = @Content(
               mediaType = "application/json", 
               schema = @Schema(implementation = Billing.class))),
       @ApiResponse(
           responseCode = "400", 
           description = "The request parameters are invalid", 
           content = @Content(
               mediaType = "application/json")),
       @ApiResponse(
           responseCode = "404", 
           description = "Updated billing could not be generated", 
           content = @Content(mediaType = "application/json")),
       @ApiResponse(
           responseCode = "500", 
           description = "An unplanned error occurred", 
           content = @Content(mediaType = "application/json"))
 }
 )
 
 @PutMapping
 @ResponseStatus(code = HttpStatus.OK)
Billing updateBilling(@Valid @RequestBody Billing billing);

//@formatter:off
@Operation(
   summary = "Delete billing",
   description = "Returns deleted billing",
   responses = {
       @ApiResponse(
           responseCode = "201", 
           description = "The deleted billing is returned", 
           content = @Content(
               mediaType = "application/json", 
               schema = @Schema(implementation = Billing.class))),
       @ApiResponse(
           responseCode = "400", 
           description = "The request parameters are invalid", 
           content = @Content(
               mediaType = "application/json")),
       @ApiResponse(
           responseCode = "404", 
           description = "Deleted billing could not be generated", 
           content = @Content(mediaType = "application/json")),
       @ApiResponse(
           responseCode = "500", 
           description = "An unplanned error occurred", 
           content = @Content(mediaType = "application/json"))
}
)

@DeleteMapping
@ResponseStatus(code = HttpStatus.OK)
Billing deleteBilling(@Valid @RequestBody Billing billing);




//@formatter:on */



    
 
 

 // @formatter:on */


}
