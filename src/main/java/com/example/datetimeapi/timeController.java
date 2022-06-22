package com.example.datetimeapi;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class timeController {


        public static void main(String[] args) {
            LocalDate myObj = LocalDate.now(); // Create a date object
            System.out.println(myObj); // Display the current date
        }


}
