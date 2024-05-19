package enums.payments;
// Assignment: 4
// Author: Danielle Elnekave, ID: 208267096

/**
 * A test class for the Payment class.
 */
public class PaymentTest {
    public static void main(String[] args) {

        // Create instances of Payment using different payment methods
        Payment payment1 = new Payment(254, PaymentMethod.PAYPAL);
        Payment payment2 = new Payment(798.45, PaymentMethod.CASH);
        Payment payment3 = new Payment(478212.15, PaymentMethod.BANK_TRANSFER);

        // Print the details of each payment
        payment1.printPaymentDetails();
        payment2.printPaymentDetails();
        payment3.printPaymentDetails();
    }
}
