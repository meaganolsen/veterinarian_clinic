package com.finalproject.VeterinarianClinic.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.finalproject.VeterinarianClinic.entities.AppointmentServices;
import com.finalproject.VeterinarianClinic.entities.Appointments;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

@Validated
@RequestMapping("/AppointmentServices")
@OpenAPIDefinition(info = @Info(title = "Appointment Services Service"),
servers = {@Server(url = "http://localhost:8080",description = "Local Server.")})

public interface AppointmentServicesController {
  //@formatter: off
  @Operation(
      summary = "Returns a list of Appointment Services",
      description = "Returns a list of Appointment services.",
      responses = {
          @ApiResponse(
              responseCode = "200",
              description = "Success.",
              content = @Content(
                  mediaType = "application/json", 
                  schema =  @Schema(implementation = AppointmentServices.class))),
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
      

    }
  )
      @GetMapping
      @ResponseStatus(code = HttpStatus.OK)
      List<AppointmentServices> getAppointmentServices();




}
