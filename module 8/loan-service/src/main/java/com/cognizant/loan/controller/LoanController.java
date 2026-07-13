package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for loan operations.
 */
@RestController
@RequestMapping("/loans")
public class LoanController {

    /**
     * Retrieves loan details for a given loan number.
     *
     * @param number The loan number
     * @return Dummy loan details
     */
    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable("number") String number) {
        // Return dummy loan details as requested
        return new Loan(number, "Car", 400000, 3258, 18);
    }
}
