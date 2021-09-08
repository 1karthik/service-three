package com.test.servicethree.controller;


import com.test.servicethree.components.LogMethodParam;
import com.test.servicethree.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/api")
public class ConcatenateController {

    @PostMapping("/user/details")
    @LogMethodParam
    ResponseEntity<String> userDetails(@RequestBody @Valid User user) {
        return ResponseEntity.ok(user.getName() + " " + user.getSurname());
    }


}
