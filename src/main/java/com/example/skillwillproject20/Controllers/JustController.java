package com.example.skillwillproject20.Controllers;

import com.example.skillwillproject20.Model.PersonRequest;
import com.example.skillwillproject20.exception.CustomException;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class JustController {

    @PostMapping("/getName")
    public void getName()
    {
        throw new CustomException("something went wrong");
    }

    @PostMapping("/CreateUser")
    public PersonRequest createUser(@RequestBody @Valid PersonRequest personRequest)
    {
        return personRequest;
    }
}
