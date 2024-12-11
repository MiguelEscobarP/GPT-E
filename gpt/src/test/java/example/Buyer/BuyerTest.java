package example.Buyer;

import org.example.Buyer.Buyer;
import org.example.Buyer.PaymentMethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuyerTest {

    @Test
    void testValidBuyerCreation() {
        Buyer buyer = new Buyer(1, "John Doe");
        assertEquals("John Doe", buyer.getFullName());
        assertEquals(0, buyer.getPaymentMethods().size());
    }

    @Test
    void testBuyerFullNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Buyer(1, ""));
        assertThrows(IllegalArgumentException.class, () -> new Buyer(1, null));
    }

    @Test
    void testAddPaymentMethod() {
        Buyer buyer = new Buyer(1, "John Doe");
        PaymentMethod paymentMethod = new PaymentMethod("Credit Card", "1234-5678-9012");
        buyer.addPaymentMethod(paymentMethod);
        assertEquals(1, buyer.getPaymentMethods().size());
        assertEquals("Credit Card", buyer.getPaymentMethods().get(0).getType());
    }
}