
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Represents a buyer with a unique ID, full name, and a list of payment methods.
 */
public class Buyer {

    // Constants class to store constant values
    public static final class Constants {
        private Constants() {
            // Private constructor to prevent instantiation
        }

        public static final String INVALID_NAME_ERROR = "Full name cannot be null or empty.";
    }

    private final int id;
    private String fullName;
    private final List<PaymentMethod> paymentMethods;

    /**
     * Constructs a Buyer with the specified ID and full name, initializing the payment methods list.
     *
     * @param id       the unique identifier for the buyer
     * @param fullName the full name of the buyer
     * @throws IllegalArgumentException if the full name is null or empty
     */
    public Buyer(int id, String fullName) {
        validateFullName(fullName);
        this.id = id;
        this.fullName = fullName.trim();
        this.paymentMethods = new ArrayList<>();
    }

    /**
     * Validates the provided full name.
     *
     * @param fullName the full name to be validated
     * @throws IllegalArgumentException if the full name is null or empty
     */
    private void validateFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException(Constants.INVALID_NAME_ERROR);
        }
    }

    /**
     * Gets the buyer's full name.
     *
     * @return the full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets a new full name for the buyer after validation.
     *
     * @param fullName the new full name
     */
    public void setFullName(String fullName) {
        validateFullName(fullName);
        this.fullName = fullName.trim();
    }

    /**
     * Gets the list of payment methods. This returns an unmodifiable view to ensure encapsulation.
     *
     * @return an unmodifiable list of payment methods
     */
    public List<PaymentMethod> getPaymentMethods() {
        return Collections.unmodifiableList(paymentMethods);
    }

    /**
     * Adds a new payment method to the buyer's list.
     *
     * @param paymentMethod the payment method to add.
     * @throws NullPointerException if paymentMethod is null
     */
    public void addPaymentMethod(PaymentMethod paymentMethod) {
        Objects.requireNonNull(paymentMethod, "Payment method cannot be null.");
        paymentMethods.add(paymentMethod);
    }

    /**
     * Gets the buyer's ID.
     *
     * @return the buyer ID
     */
    public int getId() {
        return id;
    }

    // Consider overriding equals, hashCode, and toString methods as needed
}

// Placeholder for PaymentMethod class, assuming it's defined elsewhere
class PaymentMethod {
    // Implementation goes here
}