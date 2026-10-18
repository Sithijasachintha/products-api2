package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 * Already provided:
 *   GET /hello   -> a simple greeting
 *   GET /status  -> a simple status message
 * TODO (Lab Activity 3):
 *   Add a new endpoint GET /goodbye that returns the String
 *   "Goodbye from Spring Boot!"
 */

@RestController
@RequestMapping("/products")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){
        return "API running -" + LocalDate.now().toString();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }

    // TODO (Activity 3): add your /goodbye endpoint here.
    @GetMapping("/goodbye")
    public String goodBye() {
        return "Good Bye from Spring Boot!";
    }

}
