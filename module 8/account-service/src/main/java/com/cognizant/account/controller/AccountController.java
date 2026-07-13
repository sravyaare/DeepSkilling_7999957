package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for account operations.
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {

    /**
     * Retrieves account details for a given account number.
     *
     * @param number The account number
     * @return Dummy account details
     */
    @GetMapping("/{number}")
    public Account getAccount(@PathVariable("number") String number) {
        // Return dummy account details as requested
        return new Account(number, "Savings", 234343);
    }
}
