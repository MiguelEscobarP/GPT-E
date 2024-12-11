package org.example.Buyer;

/**
 * Represents a payment method with a type and details.
 */
public class PaymentMethod {
    private String type;
    private String details;

    public PaymentMethod(String type, String details) {
        this.type = type;
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}