/**
 * 
 */
package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ComponentScamMarker.class} )
public class jeepSales {

  public static void main(String[] args) {
    SpringApplication.run(jeepSales.class, args);
  }

}
