package ir.uid.hosein;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    // @RequestMapping("/currentime")
    // @ResponseBody
    @GetMapping("/data")
    public ResponseEntity<Object> getData() {
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
    @GetMapping("/currentime")
    public ResponseEntity<Object> getDate() {
        Map<String, > data = new HashMap<>();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        data.put("localDate", localDate);
        data.put("localTime", "localTime");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    public String creditscore() {
        // int creditScoreMin = 500;
        // int creditScoreMax = 900;
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        // System.out.println(localDate);
        // System.out.println(localTime);
        // Random rand = new Random();
        // int randomCreditScore = rand.nextInt(creditScoreMin, creditScoreMax);
        

        return String.format("{ \"current date is: \": \"%s\" \"current time is: \": \"%s\" }", localDate , localTime);
    }
    
}
