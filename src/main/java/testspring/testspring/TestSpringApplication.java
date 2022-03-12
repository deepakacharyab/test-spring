package testspring.testspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringApplication {

    @GetMapping("/")
    public String home(){
        return "Test Application";
    }

    @GetMapping("/deepak")
    public String home1(){
        return "Test Application2";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestSpringApplication.class, args);
    }

}