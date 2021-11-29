package com.finalproject.VeterinarianClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.finalproject.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class VeterinarianClinic {
  public static void main(String[] args) {
      SpringApplication.run(VeterinarianClinic.class, args);
    
    }

  }


