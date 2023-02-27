package vasilkov.lab1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class TestCont {
    @GetMapping
    public ResponseEntity<String> s(){
        return ResponseEntity.ok("aaa");
    }
}
