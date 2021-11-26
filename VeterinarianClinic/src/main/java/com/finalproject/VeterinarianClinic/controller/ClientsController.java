package com.finalproject.VeterinarianClinic.controller;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.finalproject.VeterinarianClinic.entities.Clients;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;


@Validated
@RequestMapping("/Clients")
@OpenAPIDefinition(info = @Info(title = "Clients Service"),
servers = {@Server(url = "http://localhost:8080", description = "Local server.")})


public interface ClientsController {

  

  // @formatter: off
  @Operation(
      summary = "Returns a list of Clients",
      description = "Returns a list of Clients given an ID and/or name.",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "Success.",
              content = @Content(
                  mediaType = "application/json", 
                  schema =  @Schema(implementation = Clients.class))),
          @ApiResponse(
              responseCode = "400",
              description = "Bad input.",
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "404",
              description = "Not found.",
              content = @Content(mediaType = "application/json")),
          @ApiResponse(
              responseCode = "500",
              description = "Unplanned error.",
              content = @Content(mediaType = "application/json"))
      },
      parameters = {
          @Parameter(
              name = "Client",
              allowEmptyValue = false,
              required = false,
              description = "The Client name(i.e., 'Sarah Smith')"),
          @Parameter(
              name = "ID",
              allowEmptyValue = false,
              required = false,
              description = "The ID number(i.e., '1')")
      }      
   )
   @GetMapping
   @ResponseStatus(code = HttpStatus.OK)
   List<Clients> getClients();
 
  // @formatter:on */




}