package com.mercedesbenz.sechub.commons.core.security.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BinaryStringFactoryTest {
    @Test
    void create_from_string_no_type_given() {
        /* prepare */
        String string = "hello";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(string);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(binaryString.getType(), BinaryStringEncodingType.BASE64);
        assertTrue(binaryString instanceof Base64String);
        assertEquals("aGVsbG8=", binaryString.toString());
    }

    @Test
    void create_from_string_base64_type_given() {
        /* prepare */
        String string = "Hello 🌌!";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(string, BinaryStringEncodingType.BASE64);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(binaryString.getType(), BinaryStringEncodingType.BASE64);
        assertTrue(binaryString instanceof Base64String);
        assertEquals("SGVsbG8g8J+MjCE=", binaryString.toString());
    }
    
    @Test
    void create_from_string_plain_type_given() {
        /* prepare */
        String string = "hello";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(string, BinaryStringEncodingType.PLAIN);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(binaryString.getType(), BinaryStringEncodingType.PLAIN);
        assertTrue(binaryString instanceof PlainString);
        assertEquals("hello", binaryString.toString());
    }
    
    @Test
    void create_from_string_hex_type_given() {
        /* prepare */
        String string = "hello";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(string, BinaryStringEncodingType.HEX);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.HEX, binaryString.getType());
        assertTrue(binaryString instanceof HexString);
        assertEquals("68656c6c6f", binaryString.toString());
    }
    
    @Test
    void create_from_string_no_type_given_and_input_null() {
        /* prepare */
        String string = null;
        
        /* execute */
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BinaryStringFactory.create(string);
        });
        
        /* test */
        assertEquals("String cannot be null.", exception.getMessage());
    }
    
    @Test
    void create_from_bytes_no_type_given() {
        /* prepare */
        byte[] bytes = new byte[] { 104, 101, 108, 108, 111};
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(bytes);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.BASE64, binaryString.getType());
        assertTrue(binaryString instanceof Base64String);
        assertEquals("aGVsbG8=", binaryString.toString());
    }

    @Test
    void create_from_bytes_base64_type_given() {
        /* prepare */
        byte[] bytes = new byte[] { 104, 101, 108, 108, 111};
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(bytes, BinaryStringEncodingType.BASE64);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.BASE64, binaryString.getType());
        assertTrue(binaryString instanceof Base64String);
        assertEquals("aGVsbG8=", binaryString.toString());
    }
    
    @Test
    void create_from_bytes_plain_type_given() {
        /* prepare */
        byte[] bytes = new byte[] { 104, 101, 108, 108, 111};
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(bytes, BinaryStringEncodingType.PLAIN);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.PLAIN, binaryString.getType());
        assertTrue(binaryString instanceof PlainString);
        assertEquals("hello", binaryString.toString());
    }
    
    @Test
    void create_from_bytes_hex_type_given() {
        /* prepare */
        byte[] bytes = new byte[] { 104, 101, 108, 108, 111};
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.create(bytes, BinaryStringEncodingType.HEX);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.HEX, binaryString.getType());
        assertTrue(binaryString instanceof HexString);
        assertEquals("68656c6c6f", binaryString.toString());
    }
    
    @Test
    void create_from_bytes_no_type_given_and_input_null() {
        /* prepare */
        byte[] bytes = null;

        /* execute */
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            BinaryStringFactory.create(bytes);
        });

        /* test */
        assertEquals("String cannot be null.", exception.getMessage());
    }
    
    @Test
    void createFromHex_from_bytes_plain_type_given() {
        /* prepare */
        String string = "68656c6c6f";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.createFromHex(string, BinaryStringEncodingType.PLAIN);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.PLAIN, binaryString.getType());
        assertTrue(binaryString instanceof PlainString);
        assertEquals("hello", binaryString.toString());
    }
    
    @Test
    void createFromHex_base64_type_given() {
        /* prepare */
        String string = "68656c6c6f";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.createFromHex(string, BinaryStringEncodingType.BASE64);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.BASE64, binaryString.getType());
        assertTrue(binaryString instanceof Base64String);
        assertEquals("aGVsbG8=", binaryString.toString());
    }
    
    
    @Test
    void createFromBase64_plain_type_given() {
        /* prepare */
        String string = "aGVsbG8=";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.createFromBase64(string, BinaryStringEncodingType.PLAIN);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.PLAIN, binaryString.getType());
        assertTrue(binaryString instanceof PlainString);
        assertEquals("hello", binaryString.toString());
    }
    
    @Test
    void createFromBase64_hex_type_given() {
        /* prepare */
        String string = "aGVsbG8=";
        
        /* execute */
        BinaryString binaryString = BinaryStringFactory.createFromBase64(string, BinaryStringEncodingType.HEX);
        
        /* test */
        assertNotNull(binaryString);
        assertEquals(BinaryStringEncodingType.HEX, binaryString.getType());
        assertTrue(binaryString instanceof HexString);
        assertEquals("68656c6c6f", binaryString.toString());
    }
}
