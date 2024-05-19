package enums.payments;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

import java.util.Random;

/**
 * Represents a payment with an amount, payment method, and reference number.
 */
public class Payment {

    private double amount;
    private PaymentMethod method;
    private String referenceNumber;

    /**
     * Constructs a payment with the specified amount and payment method.
     * Generates a random reference number for the payment.
     *
     * @param amount The amount of the payment.
     * @param method The payment method used.
     */
    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
        this.referenceNumber = generateReferenceNumber();
    }

    /**
     * Generates a random reference number for the payment.
     *
     * @return The randomly generated reference number.
     */
    private String generateReferenceNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(900000) + 100000;
        return "REF " + randomNumber;
    }

    /**
     * Prints the details of the payment, including the amount, payment method, and reference number.
     */
    public void printPaymentDetails() {
        String str = "Amount: " + amount
                + ", Payment method: " + method
                + ", Reference number: " + referenceNumber;

        System.out.println(str);
    }
}
