package com.cognizant.loan;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    @GetMapping("/loans/{no}")
    public Loan getLoan(@PathVariable String no) {
        return new Loan(no, "Car", 100000, 3258, 18);
    }

    class Loan {
        private String no;
        private String type;
        private int loan, emi, tenure;

        public Loan(String no, String type, int loan, int emi, int tenure) {
            this.no = no;
            this.type = type;
            this.loan = loan;
            this.emi = emi;
            this.tenure = tenure;
        }

        public String getNumber() {
        	return no;
        }
        public String getType() {
        	return type;
        }
        public int getLoan() { 
        	return loan; 
        }
        public int getEmi() {
        	return emi;
        }
        public int getTenure() {
        	return tenure;
        }
    }
}