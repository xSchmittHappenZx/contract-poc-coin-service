package xschmitthappenzx.contractpoccoinservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CoinController {

    @GetMapping("/coin")
    ResponseEntity<List<String>> coin(){
        return ResponseEntity.status(201).body(Arrays.asList("BTC", "ETH"));
    }
}
