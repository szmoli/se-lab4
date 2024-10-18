package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void getTorpedoCount_Success() {
        TorpedoStore store = new TorpedoStore(1);
        int result = store.getTorpedoCount();
        assertEquals(1, result);
    }

    @Test
    void fire_Exception() {
        TorpedoStore store = new TorpedoStore(1);
        Exception result = assertThrows(IllegalArgumentException.class, () -> store.fire(2));
    }

    @Test
    void TorpedoStore_failureEnv() {
        System.getenv().put("IVT_FAILURE", "asd");
        TorpedoStore store = new TorpedoStore(1);
    }
}
