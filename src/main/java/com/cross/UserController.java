package com.cross;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = {
        "https://frontend-part1.vercel.app",
        "http://localhost:5500",
        "http://127.0.0.1:5500"
})
@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return List.of("Sachin", "Rahul", "Anjali");
    }
}
