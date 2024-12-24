package com.example.javaheadfirsy.PracticeExamples;

public class PaymentSystemTest {


    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(1000.00, "234454564598");
        creditCardPayment.ProcessPayment();

        PaypalPayment paypalPayment = new PaypalPayment(1200, "alam@email.com");
        paypalPayment.ProcessPayment();
    }
}
