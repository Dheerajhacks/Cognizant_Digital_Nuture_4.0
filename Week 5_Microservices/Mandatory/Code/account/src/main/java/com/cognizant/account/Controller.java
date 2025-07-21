package com.cognizant.account;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    @GetMapping("/accounts/{no}")
    public Account getAccount(@PathVariable String no) {
        return new Account(no, "Savings", 100000);
    }

    class Account {
        private String no;
        private String type;
        private double balance;

        public Account(String no, String type, double balance) {
            this.no = no;
            this.type = type;
            this.balance = balance;
        }

        public String getNumber() {
        	return no;
        }
        public String getType() {
        	return type;
        }
        public double getBalance() { 
        	return balance; 
        }
    }
}