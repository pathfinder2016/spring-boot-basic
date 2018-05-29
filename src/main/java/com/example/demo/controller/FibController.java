package com.example.demo.controller;

import com.example.demo.domain.Fib;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fib")
public class FibController {

    @RequestMapping("/{index}")
    public int updateMajor(@PathVariable("index") int index) {
        return new Fib().queryValueByIndex(index);
    }
}
