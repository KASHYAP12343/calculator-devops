package com.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") // For development; allow all origins to fix "Failed to fetch"
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/mul")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/div")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double x) {
        return Math.sqrt(x);
    }

    @GetMapping("/power")
    public double power(@RequestParam double x, @RequestParam double b) {
        return Math.pow(x, b);
    }

    @GetMapping("/ln")
    public double ln(@RequestParam double x) {
        return Math.log(x);
    }

    @GetMapping("/factorial")
    public long factorial(@RequestParam int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}