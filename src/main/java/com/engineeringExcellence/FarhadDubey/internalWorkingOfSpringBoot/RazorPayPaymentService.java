package com.engineeringExcellence.FarhadDubey.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class RazorPayPaymentService {

    public String pay() {
        String payment = "Razorpay Payment";
        System.out.println("Paid by : " + payment);
        return payment;
    }

}
