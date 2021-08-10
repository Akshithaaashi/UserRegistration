package com.userregistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @BeforeEach
    public void setup() {
        UserRegistration userRegistration = new UserRegistration();
    }

    //positive test case  for userName return->true
    @Test
    public void givenFirstName_WhenFirstNameCapital_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateUsername("Akshitha");

        Assertions.assertTrue(actual);
    }

    //negative test case for userName return->false
    @Test
    public void givenFirstName_WhenFirstNameCapital_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateUsername("abc");
        Assertions.assertFalse(actual);
    }

    //positive test case for LastName return->true
    @Test
    public void givenLastName_WhenLastNameCapital_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateLastname("Abcd");
        Assertions.assertTrue(actual);
    }

    //negative test case for userName return->false
    @Test
    public void givenlastName_WhenlastNameCapital_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateLastname("abcd");
        Assertions.assertFalse(actual);
    }

    //positive test case for PhoneNo return->true
    @Test
    public void givenphoneNo_WhenPhoneNoTendigit_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateMobileNo("916932548763");
        Assertions.assertTrue(actual);
    }

    //negative test case for PhoneNo return->false
    @Test
    public void givenPhoneNo_WhenPhoneNoTendigit_Capital_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validateMobileNo("4785748596");
        Assertions.assertFalse(actual);
    }

    //positive test case for PhoneNo return->true
    @Test
    public void givenPassword_WhenPasswordCondition_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validatePassword("Akshit@1");
        Assertions.assertTrue(actual);
    }

    //negative test case for PhoneNo return->false
    @Test
    public void givenPhoneNo_WhenPasswordCondition_Capital_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean actual = userRegistration.validatePassword("akshitha");
        Assertions.assertFalse(actual);
    }
}