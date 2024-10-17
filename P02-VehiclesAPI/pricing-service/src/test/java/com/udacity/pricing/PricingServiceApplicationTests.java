package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal; // Add this import

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PricingServiceApplicationTests {

    @Autowired
    private PriceRepository priceRepository;

    // Test to ensure the application context loads correctly
    @Test
    public void contextLoads() {
    }

    // Additional test to check if a price can be retrieved from the repository
    @Test
    public void testPriceRetrieval() {
        // Create and save a price in the repository
        Price price = new Price("USD", new BigDecimal("19999.99"), 1L);
        priceRepository.save(price);

        // Retrieve the price
        Price retrievedPrice = priceRepository.findById(1L).orElse(null);
        assertNotNull(retrievedPrice, "Price should not be null");
    }
}
